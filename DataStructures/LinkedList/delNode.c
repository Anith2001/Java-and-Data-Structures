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

/* Delete the node given the node name*/

void delNode(char *key) 	
{
    struct Node *temp = hptr, *prev;
 
    // If head node itself holds the key to be deleted
    if (temp != NULL && (strcmp(temp->name, key) == 0)) {
        hptr = temp->next; // Changed head
        free(temp); // free old head
        return;
    }
 
    // Search for the key to be deleted, keep track of the
    // previous node as we need to change 'prev->next'
    while (temp != NULL && strcmp(temp->name, key)) {
        prev = temp;
        temp = temp->next;
    }
 
    // If key was not present in linked list
    if (temp == NULL)
        return;
 
    // Unlink the node from linked list
    prev->next = temp->next;
 
    free(temp); // Free memory
}

void main(int argc, char * argv[])
{
	char nodeName[20];
	int i = 1;
	for(; i < argc; i++)
		createList(argv[i]);

	printf("Enter node to delete \n");
	scanf("%s", nodeName);
	delNode(nodeName);
	display();
}

/*
delNode hello kmit ngit world 

ngit
*/