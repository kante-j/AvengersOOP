package avengers;

public class JAVA_Avengers {
//	private Story story;
	private characters character;
	private Questions question;
	private Die dice;
	
	
	public void java(){
	int location = 0;
	int roll;
	dice = new Die();
	character = new Hulk();
	//of character = new CaptainAmerica();
	
	
	while(true){//계속 돌게하는 것으로 수정할 것
		roll = dice.getValue();
		location += roll;
		if(location >= 11 ){
			location=11;
			
		}
	
	if(location ==1){
		new FillBlank();
	}
	else if(location ==2){
		
	}
	else if(location ==2){
		
	}
	else if(location ==3){
	
	}
	else if(location ==4){
	
	}
	else if(location ==5){
	}
	else if(location ==6){
	}
	else if(location ==7){
	}
	else if(location ==8){
	
	}
	else if(location ==9){
		
	}
	else if(location ==10){
		
	}
	else{
//		new Fight();
		break;
	}
	}

	
	
	
	
	
	
	
	
	
}
