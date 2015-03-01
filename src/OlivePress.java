// need to finish this one with other part
public class OlivePress{
		private Olive[] _olives;

		public void OlivePress(Olive[] olives){
			this._olives = olives;
		}

		public OliveOil getOil(){
			// .. implementation next slide..
			// here
			if (_olives == null) {
				return null;
				OliveOil oil = new OliveOil();
				for (Olive olive:olives){
					olive.crush();
					oil.add(olive);
				}
				return oil;
			}
		}
	}
