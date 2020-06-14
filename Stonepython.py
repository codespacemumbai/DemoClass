import random

quit = False
print("========================================")
print(" Welcome to the rock paper scissor game")
print("========================================")

print(" ")

score = 0
comp_score = 0
win_percent = 0
num_rounds = 0

while (quit==False):

  print("Round Number: " + str(num_rounds+1))
  print("CURRENT SCORE:\t\t"+"Player: "+str(score)+"\tComputer: "+str(comp_score)+"\tWin Percentage: "+str(int(win_percent))+"%")
  x=input(" Choose an option to play R(Rock)/P(Paper)/S(Scissor) or Q to quit ")

  if (x!='R' and x!='P' and x!='S' and x!='Q'):
    print("Please give a correct input!")
    continue
		

  if x=='Q':
    print("")
    print("HOPE YOU HAD FUN!!!")
    print("Rounds Played: "+str(num_rounds))
    print("FINAL SCORES:\t"+"Player: "+str(score)+"\tComputer: "+str(comp_score)+"\tWin Percentage: "+str(win_percent)+"%")
    quit=1
    break
  
  else:
    print("You chose: ",end="")
    #p=0

    if x=='R':
      print("Rock")
      p=0

    elif x=='P':
      print("Paper")
      p=1

    elif x=='S':
      print("Scissors")
      p=2

    print("Waiting for computer's choice..............")
    print("...")
    c = random.randint(0,2)
    print("Computer chose: ", end="")

    if c == 0 :
      print("Rock")
      
    elif c==1 :
      print("Paper")

    else:
      print("Scissors")

    result=0
    #0 for draw, 1 for player win, 2 for comp win

    if p==0:
      if c==0:
        result = 0
      elif c==1:
        result = -1
      else:
        result = 1
		
    if p==1:
      if c==0:
        result = 1
      elif c==1:
        result = 0
      else:
        result = -1

    if p==2:
      if c==0:
        result = -1
      elif c==1:
        result = 1
      else:
        result = 0		

    num_rounds+=1

    if result==0:
      print("Its a DRAW!")
      win_percent = int((score*100)/num_rounds)

    elif result==1: 
      print("You WON this round! Well done!")
      score+=1
      win_percent = int((score*100)/num_rounds)
			
    else:
      print("You LOST this round :(")
      comp_score+=1
      win_percent = int((score*100)/num_rounds)