class Hello{
  public static void main(String[] args) {
    System.out.println("Hello World");

    int[] hako = new int [5];
    //失敗作
    for(int i=0;i<5;i++){
      //box[i] = i+1;
      hako[i] = i*11;
    }
    for(int i=0;i<5;i++){
      System.out.println(hako[i]);
    }

  }
}
