package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.validator.PublicClassValidator;

import eu.sig.training.ch03.Nationality;

public class FlagFactory {
	
	public static class DutchFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	public static class GermanFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	public static class BelgianFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	
	public static class FrenchFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	
	public static class ItalianFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	
	public static class RomaniaFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.RED,Color.WHITE, Color.BLUE);
		}
	}
	
	public static class DefaultFlag implements Flag{
		@Override
		public List<Color> getColors() {
			return Arrays.asList(Color.GRAY);
		}
	}
	
	public static Map<Nationality, Flag> FLAGS = new HashMap<Nationality, Flag>();
	
	static {
		FLAGS.put(Nationality.DUTCH, new FlagFactory.DutchFlag());
		FLAGS.put(Nationality.GERMAN, new FlagFactory.GermanFlag());
		FLAGS.put(Nationality.BELGIAN, new FlagFactory.BelgianFlag());
		FLAGS.put(Nationality.FRENCH, new FlagFactory.FrenchFlag());
		FLAGS.put(Nationality.ITALIAN, new FlagFactory.ItalianFlag());
		FLAGS.put(Nationality.ROMANIA, new FlagFactory.RomaniaFlag());
	}
	
	public List<Color> getFlagColors(Nationality nationality){
		Flag  flag = FLAGS.get(nationality);
		flag = flag != null ? flag : new DefaultFlag();
		return flag.getColors();
	}

}