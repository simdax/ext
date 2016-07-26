+ MIDIOut{

	bank { |chan=0, bank=0|
		this.control(chan, 0, bank)
	}
	bankProg{ arg chan, bank, prog;
		this.bank(chan, bank);
		this.program(chan, prog)
	}	
	programPlus { |chan, prog|
		var tmp=[prog.div(128), prog%128];
		this.bankProg(chan, tmp[0], tmp[1])
	}
	
	printOn{arg stream;
		var s="MIDIOut "++port;
		stream<<s;
	}
}
