class Hello{
  public static void main(String[] args) {
    System.out.println("Hello World");
    //失敗作
    int[] hako = new int [5];

    for(int i=0;i<6;i++){
      hako[i] = i+1;
    }
    for(int i=0;i<5;i++){
      Sysytem.out.println(hako[i]);
    }
  }
}
