#include<vector>
#include<iostream>
using namespace std;
class Student
{
public:
int rollNumber;
string name;
Student(int rollNumber,string name)
{
this->rollNumber=rollNumber;
this->name=name;
}
};
int main()
{
vector<Student *> v;
Student *s1=new Student(101,"AAAA");
Student *s2=new Student(102,"BBBB");
Student *s3=new Student(103,"CCCC");
Student *s4=new Student(104,"DDDD");
v.push_back(s1);
v.push_back(s2);
v.push_back(s3);
v.push_back(s4);
for(auto t:v)
{
cout<<t->name<<"  "<<t->rollNumber<<endl;
}
return 0;
}