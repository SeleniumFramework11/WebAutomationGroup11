package TestMainPage;
import org.testng.annotations.Test;
public class SearchMovies extends TestMainPage{
    @Test
    public void searchBox(){
        clickSearchBox("Stranger Things");
        clearSearchBox();
        clickSearchBox("BirdBox");
       }
}