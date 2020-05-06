package com.vcs.accounts;


public class AccountImpl {

	public static void main(String[] args) {
		
		Decide decide=new Decide();
		decide.invokeMyAccount(new CurrentAccount());
		
	}
}
