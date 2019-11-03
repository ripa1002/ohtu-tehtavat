package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        @Override
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }
    
    @Test
    public void testSearchIfFound() {
        Assert.assertEquals("Lemieux", stats.search("Lemieux").getName());
    }
    
    @Test
    public void testSearchIfNotFound() {
        Assert.assertEquals(null, stats.search("Laine"));
    }
    
    @Test
    public void testTeam() {
        Assert.assertEquals(3, stats.team("EDM").size());
    }
    
    @Test
    public void testTopScore() {
        Assert.assertEquals(2, stats.topScorers(2).size());
    }
}
