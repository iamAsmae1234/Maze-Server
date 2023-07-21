# About

This project contains the server and GUI components of the final internship project in computer networks. The program starts a game of "The Crazy Labyrinth" and waits for players. After each move, it checks if the move is valid, and if not, requests another move. When a player wins, the current game ends. The server communicates via sockets and uses XML to serialize objects. The XML syntax is defined by the schema file `src/main/resources/xsd/mazeCom.xsd`.

# Build & Run

### Software Requirements

To compile the project, the following software is required:

* Java 11 - JDK
    * OpenJDK 11
* Maven 3.6

### Building:
```
mvn clean install
```

* `clean`: Deletes old compiled files.
* `install`: Starts the complete lifecycle with validate, compile, test, and install. Ensures that the server can be used as a dependency in other Maven projects.

### Running the Application:
```
mvn [compile] exec:java [-Dexec.args="-c /home/max/myconfig.properties"]
```

* `compile`: Compiles the latest changes.
* `exec:java`: Executes the Maven plugin for starting the application. NOTE: It does not compile.
* `-Dexec.args`: Specifies the parameters during execution (String[] args).

# Releases & Downloads

The jar files of the current and previous releases can be found under [Tags](../../tags).

# Configuration

Details about the configuration can be found [here](../../wikis/doc/config.md).

# SSL/TLS

Details about using encrypted connections can be found [here](../../wikis/doc/ssl.md).

# Contributions

Details on how to contribute code to the project can be found [here](../../wikis/doc/contributions.md).

# Credits

* Application icon made by [Freepik](http://www.freepik.com) from [www.flaticon.com](http://www.flaticon.com) is licensed by [CC 3.0 BY](href="http://creativecommons.org/licenses/by/3.0/).
* Many treasure icons taken from [numix-Project](https://numixproject.org/).
* Game idea originally from [Ravensburger](https://www.ravensburger.de/produkte/spiele/familienspiele/das-verrueckte-labyrinth-26446/index.html).
* Music: "Cold Sober" Kevin MacLeod (incompetech.com) Licensed under [Creative Commons: By Attribution 3.0 License ](http://creativecommons.org/licenses/by/3.0/).
