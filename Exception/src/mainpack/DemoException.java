package mainpack;

class IllegalAgeException extends Exception{
	public String getMessage(){
		return "You need to be above 18 to vote";
	}
}

class Vote{
	public void register(int age) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to register for vote");
	}
}

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vote vote = new Vote();
		try {
			vote.register(16);
		}
	}

}
