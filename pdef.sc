+ Pdef{
	trace{ arg ... args;
		if(this.source.isKindOf(Ptrace){^nil});
		// TODO function support
		if(this.source.isKindOf(Function)){
			"function ! ".warn;
			//this.source=( {arg x; x.postln; Pbind().trace<>x }<>this.source);
		}{
			this.source=this.source.trace(*args);
		}
	}
	untrace{
		if(pattern.class==Ptrace){
			this.source=this.source.pattern
		}
	}
}