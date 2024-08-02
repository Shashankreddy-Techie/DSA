def decimal_count(numbers):
    plus=0
    minus=0
    zeroes=0
    for i in numbers:
        if i>0:
            plus+=1
        elif i<0:
            minus+=1
        else:
            zeroes+=1
    positives=plus/len(numbers)
    negatives=minus/len(numbers)
    zero=zeroes/len(numbers)

    print(f"Positive decimal values is :{positives}")
    print(f"Negative decimal values is :{negatives}")
    print(f"Zeroes decimal values is :{zero}")
    
numbers=[-1,5,-9,-8,-2,0,0,0,4,3,8]
decimal_count(numbers)