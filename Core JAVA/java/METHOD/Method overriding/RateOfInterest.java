class Bank{
int getRateOfInterest()
{
return 0;
} 
}
class SBI extends Bank{
int getRateOfInterest()
{
return 8;
} 
}
class ICICi extends Bank{
int getRateOfInterest()
{
return 7;
} 
}
class PNB extends Bank{
int getRateOfInterest()
{
return 7;
}
} 
class RateOfInterestBanks{
public static void mai(String[] args){
SBI s=new SBI();
ICICi i=new ICICi();
PNB p=new PNB();
System.out.println("Rate of intrest of SBI:" +s.getRateOfInterest());
System.out.println("Rate of intrest of ICICi:" +i.getRateOfInterest());
System.out.println("Rate of intrest of PNB:" +p.getRateOfInterest());
}
}