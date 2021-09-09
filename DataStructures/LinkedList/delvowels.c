#include<stdio.h>
#include<string.h>
#include<stdlib.h>

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

void displayFromEnd(struct Node *ptr)
{
  struct Node *t;
  if(!ptr)
    return;
  displayFromEnd(ptr->next);
  printf("%s\n",ptr->name);
}

void delnode(struct Node **t) 	
{
	if(hptr == *t)      // p -> b -> c -> a -> e -> t
	{
      hptr = (*t)->next;
      // last Node
      if(hptr == NULL)  {
        free(*t);
        return;
      }
      if(hptr->next != NULL)
        hptr->next = (*t)->next->next;
      else
        hptr->next = NULL;
      free(*t); 
      return;
	}
	else { 
		struct Node *current = hptr;
		while(current->next != NULL && current->next != *t)
			current = current->next;
 
		current->next = current->next->next; 
		free(*t);
		*t = current;
		return; 
	}
}

int isStartVowel(struct Node *t)
{
  char ch = tolower(t->name[0]);
  if(ch == 'a' || ch == 'e'|| ch == 'i' ||  ch == 'o' || ch == 'u')
    return 1;
  return 0;
}

void vowelRemove()
{	
	struct Node *t= hptr;
	for(;t != NULL; t = t->next)
	{
		if(isStartVowel(t))
			delnode(&t);
	}
}

void main(int argc, char * argv[])
{
	int i = 1;
	for(; i < argc; i++)
		createList(argv[i]);

	vowelRemove();
	display();
}

/*
delvowels Egg BOY Apple Unit Test
*/