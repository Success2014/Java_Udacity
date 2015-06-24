public class HomeworkScores
{
	private double min = 10000;
	private double sum = 0;
	
	public void addScore(double score)
	{
		if(score < min)
		{
			min = score;
		}
		sum += score;
	}
	
	public double getTotalExcludingLowest()
	{
		if(min == 10000 || sum == min)
		{
			return sum;
		}
		else
		{
			return sum - min;
		}
	}

}