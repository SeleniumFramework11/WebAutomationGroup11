package testhomepage;

import homepage.BrokenLink;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBrokenLink extends BrokenLink {
    @Test
    public void findBrokenLinks() throws IOException {
        brokenLink();
    }
}
