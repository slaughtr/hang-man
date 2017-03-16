import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangMan {
  private String mWord;
  private char mUserLetter;

  public HangMan(String baseWord, char userLetter) {
    mWord = baseWord;
    mUserLetter = userLetter;
  }

  public String getWord() {
    return mWord;
  }

  public List<Character> getWordToArray() {
    char[] charArray = mWord.toCharArray();
    List<Character> charList = new ArrayList<Character>();

    for (char letters : charArray) {
      charList.add(letters);
    }
    return charList;
  }

  public List<Character> makeBlanksArray() {
    List<Character> importedList = getWordToArray();

    for (char letter : importedList) {
      letter = '-';
    }
    return importedList;
  }


}
