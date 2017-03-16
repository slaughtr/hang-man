import org.junit.*;
import static org.junit.Assert.*;

public class HangManTest {

  @Test
  public void newHangman_instantiatesCorrectly_true(){
    HangMan testGame = new HangMan("potato", 'a');
    assertEquals(true, testGame instanceof HangMan);
  }

  @Test
  public void getWord_returnString_true(){
    HangMan testGame = new HangMan("potato", 'a');
    String gotWord = testGame.getWord();
    assertEquals(true, gotWord instanceof String);
  }

  @Test
  public void getWordToArray_returnCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    char[] charArray = testGame.getWordToArray();
    assertEquals(true, charArray instanceof char[]);
  }

  @Test
  public void makeBlanksArray_returnArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    char[] charArray = testGame.getWordToArray();
    List<char> blanksArray = testGame.makeBlanksArray();
    assertEquals(true, charArray.length() == blanksArray.length());
  }
}
