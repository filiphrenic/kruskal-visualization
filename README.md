## Build
You need to download [GraphStream-core library](http://graphstream-project.org/download/) and add it to your build path

## Usage
The main class is *Main.java*. If you pass an argument, then the graph definition file will be read from that file, otherwise it will be read from stdin.

## Graph definition file
Number of nodes

List of edges (node1, node2, weight)

## Example run
`java -jar kruskal.jar graph-example.txt`

This will read graph stored in .txt file and run the program.

## Screenshots

#### Starting window
![Starting window](images/start.png)

#### Found MST
![MST](images/end.png)