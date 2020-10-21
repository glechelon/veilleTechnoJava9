package fr.glechelon.veilleTechno.java9.core.hiddenutils;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessManager {

    public List<String> listProcesses() {
        return ProcessHandle.allProcesses().map(process -> String.valueOf(process.pid())).collect(Collectors.toList());
    }


    public Process createProcess() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        return processBuilder.start();
    }


    public void killProcess(Process process){
        if (process.isAlive()) {
            process.destroy();
        }

    }
}
