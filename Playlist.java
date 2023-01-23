import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Frontlines");
    desertIslandPlaylist.add("Miss you");
    desertIslandPlaylist.add("Jugaste Y Sufri");
    desertIslandPlaylist.add("Ecstasy of Soul");
    desertIslandPlaylist.add("Alive");
    desertIslandPlaylist.add("Yesterday");
    desertIslandPlaylist.add("S.O.S.");
    desertIslandPlaylist.add("Almost Back");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("S.O.S.");
    desertIslandPlaylist.remove("Miss you");
    desertIslandPlaylist.remove("Yesterday");

    //Switch index positions of 1 and 4
    String tempA = "Jugaste Y Sufri";
    desertIslandPlaylist.set(1, "Almost Back");
    desertIslandPlaylist.set(4, tempA);
    System.out.println(desertIslandPlaylist);
  }  
}