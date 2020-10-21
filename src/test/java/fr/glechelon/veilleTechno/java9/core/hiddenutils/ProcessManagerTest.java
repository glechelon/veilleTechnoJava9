package fr.glechelon.veilleTechno.java9.core.hiddenutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class ProcessManagerTest {

    private final ProcessManager processManager = new ProcessManager();


    @AfterEach
    public void cleanUp() {

        ProcessHandle.allProcesses()
                .filter(process -> process.info()
                        .command()
                        .orElse("")
                        .contains("notepad.exe"))
                .forEach(process -> process.destroyForcibly());

    }

    @Test
    public void testListProcesses() {

        //GIVEN

        //WHEN
        List<String> out = processManager.listProcesses();

        //THEN
        System.out.println(out);
        Assertions.assertTrue(!out.isEmpty());

    }

    @Test
    public void testCreateProcess() throws IOException {

        //GIVEN

        //WHEN
        Process process = processManager.createProcess();


        //THEN
        System.out.println(process.info());

    }

    @Test
    public void testKillProcess() throws IOException, InterruptedException {

        //GIVEN

        //WHEN
        Process process = processManager.createProcess();

        //THEN
        Assertions.assertTrue(process.isAlive());

        // GIVEN
        Thread.sleep(1000);

        //WHEN
        processManager.killProcess(process);

        //THEN
        Assertions.assertTrue(!process.isAlive());

    }


}