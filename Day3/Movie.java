package com.day3;

public class Movie {
	
	private String mname;
	private String produced;
	private String directed;
	private int duration;
	private int year;
	private String category;
	private static int moviecount;
	private String movieid;
	
	public String getMovieID() {
		return mname + "_" + moviecount;
		}

		public static int getMovieCount() {
		return moviecount;
		}

		public static void setMovieCount(int movieCount) {
		Movie.moviecount = moviecount;
		}
		{
			moviecount++;
		}
		public Movie(String moviename, String produced) {
			// super();
			this.mname = mname;
			this.produced = produced;
			}
		
		
		public Movie(String mname, String produced, String directed, int duration, int year, String category) {
			// super();
			this(mname, produced);
			this.directed = directed;
			this.duration = duration;
			this.year = year;
			this.category = category;
			}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getProduced() {
			return produced;
		}

		public void setProduced(String produced) {
			this.produced = produced;
		}


		public String getDirected() {
			return directed;
		}

		public void setDirected(String directed) {
			this.directed = directed;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
		
		public String showDetails() {
			return "movieName=" + mname + ", produced=" + produced + ", directed=" + directed + ", duration="
			+ duration + ", year=" + year + ", category=" + category;
			}
		
		
		//@Override
		 //public String toString() {
		 //return "movieName=" + mname + ", produced=" + produced + ", directed=" + directed + ", duration="
		 //+ duration + ", year=" + year + ", category=" + category;
		 //}


		
		
		
		
		
		
	
	
	
	

}

	
	


