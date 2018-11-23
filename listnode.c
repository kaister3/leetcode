struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) 
{
	struct ListNode* result = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* first = result;
    while(l1 != NULL && l2 != NULL)
    {
    	result->next = (struct ListNode*)malloc(sizeof(struct ListNode));
    	result = result->next;
    	if (l1->val <= l2->val)
    	{
    		result->val = l1->val;
    		l1 = l1->next;
    	}
    	else
    	{
    		result->val = l2->val;
    		l2 = l2->next;
    	}
    }
    if (l1 == NULL)
    {
    	result->next = l2;
    }
    else if (l2 == NULL)
    {
    	result->next = l1;
    }
    return first->next;
}