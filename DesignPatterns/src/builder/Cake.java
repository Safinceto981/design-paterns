package builder;

public class Cake {

	private final double sugar;
	private final double butter;
	private final int eggs;
	private final double milk;
	private final int cocoa;
	private final int vanilia;

	public static class Builder {

		private double sugar;
		private double butter;
		private int eggs;
		private double milk;
		private int cocoa;
		private int vanilia;

		public Builder sugar(double cup) {
			this.sugar = cup;
			return this;
		}

		public Builder butter(double cup) {
			this.butter = cup;
			return this;
		}

		public Builder milk(double cup) {
			this.milk = cup;
			return this;
		}

		public Builder eggs(int spoons) {
			this.eggs = spoons;
			return this;
		}

		public Builder cocoa(int spoons) {
			this.cocoa = spoons;
			return this;
		}

		public Builder vanilia(int spoons) {
			this.vanilia = spoons;
			return this;
		}
		public Cake build() {
			return new Cake(this);
		}
	}

	private Cake(Builder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.cocoa = builder.cocoa;
		this.vanilia = builder.vanilia;
		this.milk = builder.milk;

	}
}
