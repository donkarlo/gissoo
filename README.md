# About Gissoo Application
 * The goal of this application is to generate short stories from hierarchical entities. By hierarchical, we mean entities are described to finer levels in a hierarchical structure such as JSON as follows:
```
    {
       "man":{
          "clothing":{
             "overcoat":{
                "color":"black"
             }
          },
          "action":"smoking"
       },
       "time":"night",
       "location":"city",
       "vitrine neon light":{
          "shape":"heart",
          "status":"beating"
       },
       "clock tower":""
    }
```
and the short story would prefereably take a literary format such as: 
> The man in black outfit was smoking in a dark corner. He didn't realize, his cigarette's flickering light was the only beating heart of the night, with which the clock tower pendulum was beating.

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

# Corpora
 * A corpus of movie plots from Wikipedia which is formed of 42,306 movie plot summaries. You may check it directly from 
```
    https://github.com/donkarlo/gissoo/blob/master/data/corpora/cmu-movie-summary-corpus-plot-summaries.txt
```
or for further information and other download options, you can take a loot at 
```
    http://www.cs.cmu.edu/~ark/personas/
```

# Todo
 * Evaluations
