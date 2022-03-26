package xyz.jaysexternals.jaysdragons;

import net.runelite.client.config.*;


@ConfigGroup("arunedragons")
public interface RuneDragonsConfig extends Config
{

	@ConfigItem(
			keyName = "superantifires",
			name = "Use Super Antifires",
			description = "Enable to use extended super antifires. Disable to use extended antifires.",
			position = 1,
			section = "pluginConfig"
	)
	default boolean superantifires() { return false; }


	@ConfigItem(
			keyName = "typecb",
			name = "Combat Type",
			description = "Chose which combat style you are using",
			position = 2,
			section = "pluginConfig"
	)
	default CombatType typecb()
	{
		return CombatType.MELEE;
	}

	@ConfigSection(
			keyName = "delayConfig",
			name = "Sleep Delay Configuration",
			description = "Configure how the bot handles sleep delays",
			position = 0
	)
	String delayConfig = "delayConfig";

	@Range(
			min = 0,
			max = 550
	)
	@ConfigItem(
			keyName = "sleepMin",
			name = "Sleep Min",
			description = "",
			position = 2,
			section = "delayConfig"
	)
	default int sleepMin()
	{
		return 60;
	}

	@Range(
			min = 0,
			max = 550
	)
	@ConfigItem(
			keyName = "sleepMax",
			name = "Sleep Max",
			description = "",
			position = 3,
			section = "delayConfig"
	)
	default int sleepMax()
	{
		return 350;
	}

	@Range(
			min = 0,
			max = 550
	)
	@ConfigItem(
			keyName = "sleepTarget",
			name = "Sleep Target",
			description = "",
			position = 4,
			section = "delayConfig"
	)
	default int sleepTarget()
	{
		return 100;
	}

	@Range(
			min = 0,
			max = 550
	)
	@ConfigItem(
			keyName = "sleepDeviation",
			name = "Sleep Deviation",
			description = "",
			position = 5,
			section = "delayConfig"
	)
	default int sleepDeviation()
	{
		return 10;
	}

	@ConfigItem(
			keyName = "sleepWeightedDistribution",
			name = "Sleep Weighted Distribution",
			description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
			position = 6,
			section = "delayConfig"
	)
	default boolean sleepWeightedDistribution()
	{
		return false;
	}


	@Range(
			min = 0,
			max = 10
	)
	@ConfigItem(
			keyName = "tickDelayMin",
			name = "Game Tick Min",
			description = "",
			position = 8,
			section = "delayConfig"
	)
	default int tickDelayMin()
	{
		return 1;
	}

	@Range(
			min = 0,
			max = 10
	)
	@ConfigItem(
			keyName = "tickDelayMax",
			name = "Game Tick Max",
			description = "",
			position = 9,
			section = "delayConfig"
	)
	default int tickDelayMax()
	{
		return 3;
	}

	@Range(
			min = 0,
			max = 10
	)
	@ConfigItem(
			keyName = "tickDelayTarget",
			name = "Game Tick Target",
			description = "",
			position = 10,
			section = "delayConfig"
	)
	default int tickDelayTarget()
	{
		return 2;
	}

	@Range(
			min = 0,
			max = 10
	)
	@ConfigItem(
			keyName = "tickDelayDeviation",
			name = "Game Tick Deviation",
			description = "",
			position = 11,
			section = "delayConfig"
	)
	default int tickDelayDeviation()
	{
		return 1;
	}

	@ConfigItem(
			keyName = "tickDelayWeightedDistribution",
			name = "Game Tick Weighted Distribution",
			description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
			position = 12,
			section = "delayConfig"
	)
	default boolean tickDelayWeightedDistribution()
	{
		return false;
	}

	@ConfigSection(
			keyName = "pluginConfig",
			name = "Plugin Configuration",
			description = "Configure how the plugin should work",
			position = 13
	)
	String pluginConfig = "pluginConfig";

	@ConfigItem(
			keyName = "usePOHPool",
			name = "POH Pool",
			description = "Enable to use POH Pool",
			position = 50,
			hidden = false,
			unhide = "taskCave",
			section = pluginConfig
	)
	default boolean usePOHPool() { return true; }

	@ConfigItem(
			keyName = "useRestores",
			name = "Use Super Restores",
			description = "Disable to use Prayer Potions",
			section = pluginConfig,
			position = 56
	)
	default boolean useRestores() { return true; }

	@ConfigItem(
			keyName = "praypotAmount",
			name = "# Of Restores/Prayers",
			description = "Amount of super restores to withdraw from the bank",
			section = pluginConfig,
			position = 57
	)
	default int praypotAmount() { return 2; }

	@ConfigItem(
			keyName = "nomagepots",
			name = "Ignore Magic Potions",
			description = "Enable this to override and ignore all magic potions",
			section = pluginConfig,
			position = 58
	)
	default boolean nomagepots() { return false; }

	@ConfigItem(
			keyName = "imbuedheart",
			name = "Use Imbued Heart",
			description = "Enable to use imbued heart instead of magic/divine magic pots",
			section = pluginConfig,
			position = 59
	)
	default boolean imbuedheart() { return false; }

	@ConfigItem(
			keyName = "supers",
			name = "Super Potions",
			description = "Enable for Divine Bastion Divine Magic Potions or Divine Super Combat Potions,  Disable for Range Potions Magic Potions or Combat Potions",
			section = pluginConfig,
			position = 60
	)
	default boolean supers() { return true; }

	@ConfigItem(
			keyName = "hptoLeave",
			name = "Health to exit",
			description = "Enter health remaining before your character should run/teleport away after running out of food",
			section = pluginConfig,
			position = 61
	)
	default int hptoLeave()
	{
		return 66;
	}

	@ConfigItem(
			keyName = "foodAmount",
			name = "Amount of food",
			description = "Amount of food to withdraw",
			section = pluginConfig,
			position = 74
	)
	default int foodAmount() { return 17; }

	@ConfigItem(
			keyName = "foodID",
			name = "ID of food",
			description = "ID of food to withdraw.",
			section = pluginConfig,
			position = 76
	)
	default int foodID() { return 385; }


	@ConfigItem(
			keyName = "teleType",
			name = "What form of teleportation should be used.",
			description = "chooses which form of teleportation that should be used",
			section = pluginConfig,
			position = 77
	)
	default TeleType getTeleType(){
		return TeleType.HOUSE_TABS;
	}


	@ConfigItem(
			keyName = "lootNames",
			name = "Items to loot (separate with comma)",
			description = "Provide partial or full names of items you'd like to loot.",
			section = pluginConfig,
			position = 99
	)
	default String lootNames() {
		return "visage,lump,limb,scroll,key,dragon,shield,ore,stone,rune,bar,wrath,bolts,grimy,coins";
	}





	public static enum DisplayMode
	{
		CURRENT("Current"),
		NEXT("Next"),
		BOTH("Both");

		private final String name;

		public String toString()
		{
			return this.name;
		}

		private DisplayMode(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return this.name;
		}
	}

	public static enum DisplayType
	{
		OFF("Off"),
		OVERLAY("Overlay"),
		TILE("Tile"),
		BOTH("Both");

		private final String name;

		public String toString()
		{
			return this.name;
		}

		private DisplayType(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return this.name;
		}
	}

	@ConfigItem(
			keyName = "startButton",
			name = "Start/Stop",
			description = "",
			position = 150
	)
	default Button startButton() {
		return new Button();
	}

	default boolean logParams()
	{
		return false;
	}
}