/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;


public class GraphApp {
    public static void main(String[] args) {
        
        Graphdfs theGraphdfs = new Graphdfs();
        
        theGraphdfs.addVertex('A'); //0
        theGraphdfs.addVertex('B'); //1
        theGraphdfs.addVertex('C'); //2
        theGraphdfs.addVertex('D'); //3
        theGraphdfs.addVertex('E'); //4
        
        theGraphdfs.addEdge(0, 1); //AB
        theGraphdfs.addEdge(1, 2); //BC
        theGraphdfs.addEdge(2, 3); //AD
        theGraphdfs.addEdge(3, 4); //DE
        
        System.out.print("Visits DFS: ");
        theGraphdfs.dfs();
        System.out.println();
    }
    
}
