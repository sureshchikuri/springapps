package com.vcs.accounts;

import com.vcs.test.Account;

public class Decide {

	public void invokeMyAccount(Account account){
		if(account instanceof CurrentAccount){
			((CurrentAccount) account).overDraft();
			account.withdraw();
		}
		if(account instanceof SavingsAccount){
			account.withdraw();
			
		}
	}
}
