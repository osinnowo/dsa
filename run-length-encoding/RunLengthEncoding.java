class RunLengthEncoding {
  public String runLengthEncoding(String string) {
    int maximumCount = 1;
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 1; i < string.length(); i++) {
      char currentCharacter = string.charAt(i);
      char previousCharacter = string.charAt(i - 1);
      if((currentCharacter != previousCharacter) || (maximumCount == 9)){
        stringBuilder.append(Integer.toString(maximumCount));
        stringBuilder.append(previousCharacter);
        maximumCount = 0;
      }
      maximumCount += 1;
    }

    stringBuilder.append(Integer.toString(maximumCount));
    stringBuilder.append(string.charAt(string.length() - 1));
    return stringBuilder.toString();
  }
}

