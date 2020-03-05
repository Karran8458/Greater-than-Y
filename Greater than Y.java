function greaterThany(arr,y)
{
	var counter = 0;
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>y)
		{
			counter++;
		}
	}
	return counter;
}
