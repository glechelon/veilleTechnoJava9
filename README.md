# Java 9:

## Modularité:


* La JVM est devenue modulaire.
* Les modules sont optionnels.

### Java 8 -> java 9
    
#### Utilisation:
        
* Possède un nom
* Autosuffisant (ou dépendances explicites)
* Expose des packages publiquement et encapsule en privé d’autres modules.

##### Exemple:

```java
module nomDuModule {
	exports mon.pacakge.public
}
```

#### Migration:
* Les modules sont optionnels.
* Cas nominal (modules par défaut):
    * Par défaut: tout va dans le module “unamed”
    * Il est possible d’utiliser les packages non exposés publiquement.
    * On peut utiliser l’outil deps pour analyser les dépendances avec les modules.
* Cas avec des modules non défauts:
    * Utiliser jdeps pour détecter les dépendances à des modules additionnels manquantes.

## Jshell

* REPL
* Code snippets -> fichier.jsh
* Ouvrir des fichiers .java
* JSehll API 
* Intégration IDE

## AJouts mineurs:


* Collection factories:
    * List.of()
    * Set.of()
    * Map.of()
    
* Stream :
    * takeWhile() -> prend tout ce qui répond au prédicat.
    * dropWhile() -> supprime tout ce qui ne répond pas au prédicat.
* Optional:
    * or()
    * ifPresentOrElse()

## Changements mineurs:

* Impossibilité d’utiliser “_” comme nom de variable.
* Try avec ressources peut prendre uniquement une variable.
* Méthode privée défaut pour les interfaces.

## Nouvelles API

* ProcessHandle: interaction avec les process.
* HttpCLient
* Reactive streams: 
    * Backpressure
    * Flow API:
        * Publisher 
        * Subscriber
        * Le subscriber s’abonne au publisher.
* Stackwalker:
    * walk
    * foreach
    * Stackframe

## Améliorations desktop:

* Applets dépréciés: plugin + classes liées.
* HiDPI support
* Harbuzz font renderer : car ancien renderer plus maintenue. 
* Marlin rendere (graphics): plus performant
* Feature spécifiques à des plateformes
* java.awt.Taskbar
Multi resolution images : Une même image avec plusieurs résolutions.
Java FX: Api skin publique pour la customization 

## Performance et sécurité

* Changement de GC par défaut -> GC1:
    * Plus petites zones
    * incrémental
    * marquage en parallèle 
    * Moins de temps de pause.
* Compact string: si possible ASCII sinon UNICODE : les string ne contenant pas de caractères unicode prendront 50% de la place seulement par rapport à avant.
* TLS : ALPN : pour HTTP2
