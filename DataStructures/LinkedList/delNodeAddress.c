#include<stdio.h>
#include<string.h>
#include <ctype.h>

struct Node
{
	char name[20];
	struct Node *next;
};

struct Node *hptr=NULL,*tptr;

void createList(char *s)
{
    struct Node *nptr;    
    nptr=(struct Node *)malloc(sizeof(struct Node));    
    strcpy(nptr->name,s);
    
    if(hptr==NULL)
       hptr=nptr;
    else
       tptr->next=nptr;
    tptr=nptr;
    nptr->next=NULL;
}

void display()
{
  struct Node *t;
  for(t=hptr;t!=NULL;t=t->next)
    printf("%s\n",t->name);
}

/* To delete a node we need to adjust the next pointer of the previous node to
point to the next node instead of the current node. Since we dont have a pointer
to the previous node, we cant direct its next pointer. So what do we do?
We move the data from the next node into the current node and then delete the
next node */

void delNode(struct Node *node) 	
{
  struct Node *temp = node->next;
  strcpy(node->name, node->next->name);
  node->next = temp->next;
  free(temp);	
}

void main(int argc, char * argv[])
{
  int i = 1;
  for(; i < argc; i++)
    createList(argv[i]);

  // Give input for atleast 4 nodes 
  delNode(hptr->next->next);
  display();
}

/*
delNodeAddress hello kmit ngit world 
*/