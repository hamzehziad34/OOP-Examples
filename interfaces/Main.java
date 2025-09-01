
package interfaces;


public class Main {
     public static void main(String[] args) {
        Playable instrument1 = new Guitar();
        Playable instrument2 = new Piano();

        instrument1.play(); // Output: Guitar is playing music.
        instrument2.play(); // Output: Piano is playing music.
    }
    
}
