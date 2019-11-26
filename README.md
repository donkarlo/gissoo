# About Gissoo Application
 * The goal of this application is to generate natural language with maximum artfulness indexes incorporated into them. In the very first stages it tries to output very short pieces of literary text, mostly close to poems. In further iterations, both the length and the number of artfulness indexes will be extended. 

# Methodology
 * This application tries to address the absence of a creative, artful text generation model by selecting dependency sequences derived from corpora such that the maximum artfulness is achieved through mathematically defining a set of artfulness indexes using stochastic gradient descent.
 # Applied artfulness indexes
  * Transition between antonym semantic vector classes
  * Ambiguity appeal
  * Valence, arousal and dominance(VAD) gravity of dependency sequences  

# Dependencies, compilation and running (installation commands are for Debian-based OS)
 * Java 1.8+
```
    $ sudo sudo apt-get install openjdk-8-jdk
```
 * install Maven:
```
    $ sudo apt-get install maven
```
 * clone the project from the git repository or simply copy it to a directory such as /path/to/project    
```
    $ git clone https://github.com/donkarlo/gissoo
    $ cd /path/to/project/gissoo
    $ mvn clean install
    $ mvn compile
    $ mvn clean package
    $ java -cp target/gissoo-0.1-rise.jar com.nlp.gissoo.Main
 ```
