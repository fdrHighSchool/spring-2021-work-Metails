public ArrayList<String> getDelimitersList(String[] tokens){
ArrayList<String> temp = new ArrayList<String>();
for(int i = 0; i < tokens.length; i++){
if(tokens[i].equals(this.openDel) || tokens.get[i].equals(this.closeDel)){
  temp.add(tokens[i]);
    }//end if statement
  }//end for loop
}//end getDelimitersList method

public boolean isBalanced(ArrayList<String> delimiters){
int tempOpen = 0;
int tempClose = 0;
for(int i = 0; i < delimiters.size(); i++){
  if(delimiters.get(i).equals(this.openDel){
    tempOpen++;
  }//end if openDel

  if(delimiters(.get(i).equals(this.closeDel)){
    tempClose++;
  }//end if closeDel

  if(tempOpen == tempClose){
    return true;
  }else{
    return false;
    }//end if statment of tempOpen == tempClose
  }//end for loop
  
}//end isBalanced method