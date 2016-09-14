+ Event{
	removing{ arg ... args;
		args.do{arg x;
			this[x]=nil};
	}
	keeping{ arg ... args;
		this.removing(*(this.keys--args).asArray)
	}
}

