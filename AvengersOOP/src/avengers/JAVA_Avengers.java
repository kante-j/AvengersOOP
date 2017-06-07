package avengers;

public class JAVA_Avengers {
//   private Story story;
   private static characters character;
   private Questions question;
   private static Die dice;
   
   

   public static void main(String args[]){
      int location = 0;
      int roll = 0;
      dice = new Die();
      character = new Hulk();
      
   //Main ma = new Main();
   
      FrameManager.getInstance().change(null, FrameManager.FRAME_MAIN);
   
   //ma.main(args);
//   while(true)
//   {//계속 돌게하는 것으로 수정할 것
//      
//      RollDice rol = new RollDice();
//      rol.main(args);
//      
//      location += roll;
//      if(location >= 11 )
//      {
//         location=11;
//         
//      }
//   
//   if(location ==1){
//      FillBlank fb = new FillBlank();
//      
//   }
//   else if(location ==2){
//      
//   }
//   else if(location ==2){
//      
//   }
//   else if(location ==3){
//   
//   }
//   else if(location ==4){
//   
//   }
//   else if(location ==5){
//   }
//   else if(location ==6){
//   }
//   else if(location ==7){
//   }
//   else if(location ==8){
//   
//   }
//   else if(location ==9){
//      
//   }
//   else if(location ==10){
//      
//   }
//   else{
////      new Fight();
//      break;
//   }
//   
//   }
//      
//      
   }
   
}