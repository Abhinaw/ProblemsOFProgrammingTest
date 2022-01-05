package programming;

public class LengthOfBridge {

	public static void main(String[] args) {
      // lenghtOfBridge = (Speed of Train* Time Taken) - length of train
		System.out.println(bridge_length(120, 30, 18));
	}

	public static int bridge_length(int trainLength , int speed , int time)
	{
		return ((speed*time) - trainLength);
	}
}
