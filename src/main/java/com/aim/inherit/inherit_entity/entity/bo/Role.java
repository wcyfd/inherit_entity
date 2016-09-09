package com.aim.inherit.inherit_entity.entity.bo;

import java.util.HashMap;
import java.util.Map;

public class Role {
	/** 玩家id */
	private int id;
	/** 帐号名 */
	private String account;
	/** 昵称 */
	private String name;
	/** 年龄长度 */
	private int age;
	/** 能力字符串 */
	private String abilityStr;
	/** 银币 */
	private int money;
	/** 饥饿值 */
	private int hungry;

	private Map<Integer, Byte> abilityMap = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbilityStr() {
		return abilityStr;
	}

	public void setAbilityStr(String abilityStr) {
		this.abilityStr = abilityStr;
	}

	public Map<Integer, Byte> getAbilityMap() {
		return abilityMap;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
}
