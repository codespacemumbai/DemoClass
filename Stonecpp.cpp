#include <iostream>
#include <ctime>
using namespace std;

int main(){

	bool quit = false;
	cout<<"========================================"<<endl;
	cout<<" Welcome to the rock paper scissor game"<<endl;
	cout<<"========================================"<<endl;
	cout<<endl;

	int score = 0;
	int comp_score = 0;
	int win_percent = 0;
	int num_rounds = 0;
	while(!quit){

		cout<<"Round Number: "<<num_rounds+1<<endl;
		cout<<"CURRENT SCORE:\t\t"<<"Player: "<<score<<"\tComputer: "<<comp_score<<"\tWin Percentage: "<<
				win_percent<<"%"<<endl;
		cout<<" Choose an option to play R(Rock)/P(Paper)/S(Scissor) or Q to quit "<<endl;

		char x;
		cin>>x;

		if(x!='R' && x!='P' && x!='S' && x!='Q'){
			cout<<"Please give a correct input!"<<endl;
			continue;
		}

		if(x=='Q'){
			cout<<endl<<"HOPE YOU HAD FUN!!!"<<endl;
			cout<<"Rounds Played: "<<num_rounds<<endl;
			cout<<"FINAL SCORES:\t"<<"Player: "<<score<<"\tComputer: "<<comp_score<<"\tWin Percentage: "<<win_percent<<"%"<<endl;
			quit=1;
			break;
		}
		else{
			cout<<"You chose: ";
			int p;
			switch(x){
			case 'R':cout<<"Rock"<<endl;p=0;break;
			case 'P':cout<<"Paper"<<endl;p=1;break;
			case 'S':cout<<"Scissors"<<endl;p=2;break;
			}
			cout<<"Waiting for computer's choice.............."<<endl;
			
			cout<<".";cout<<".";; cout<<"."<<endl;
			srand(time(NULL));
			int c = rand()%3;
			cout<<"Computer chose: ";
			switch(c){
			case 0:cout<<"Rock"<<endl;break;
			case 1:cout<<"Paper"<<endl;break;
			case 2:cout<<"Scissors"<<endl;break;
			}

			int result;
			//0 for draw, 1 for player win, 2 for comp win

			if(p==0){
				if(c==0){result = 0;}
				else if(c==1){result = -1;}
				else {result = 1;}
			}
			if(p==1){
				if(c==0){result = 1;}
				else if(c==1){result = 0;}
				else {result = -1;}
			}
			if(p==2){
				if(c==0){result = -1;}
				else if(c==1){result = 1;}
				else {result = 0;}
			}

			++num_rounds;
			if(result==0){cout<<"Its a DRAW!"<<endl;}
			else if(result==1){
				cout<<"You WON this round! Well done!"<<endl;
				++score;
				win_percent = (score*100)/num_rounds;
			}
			else{
				cout<<"You LOST this round :("<<endl;
				++comp_score;
				win_percent = (score*100)/num_rounds;
			}

		}


	}
return 0;
}