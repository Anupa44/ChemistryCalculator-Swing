package engine.tools;

/**
 * A list of every element, its mass, its name, its group,
 * and its atomic number.
 * @author Matthew Page
 * @version 2.0
 */

public enum Element {

	H (1,   1.00794,      "Hydrogen",     "1A"),
	He(2,   4.003,        "Helium",       "8A"),
	Li(3,   6.941,        "Lithium",      "1A"),
	Be(4,   9.012182,     "Beryllium",    "2A"),
	B (5,   10.811,       "Boron",        "3A"),
	C (6,   12.0107,      "Carbon",       "4A"),
	N (7,   14.00674,     "Nitrogen",     "5A"),
	O (8,   15.9994,      "Oxygen",       "6A"),
	F (9,   18.9984032,   "Flourine",     "7A"),
	Ne(10,  20.1797,      "Neon",         "8A"),
	Na(11,  22.989770,    "Sodium",       "1A"),
	Mg(12,  24.3050,      "Magnesium",    "2A"),
	Al(13,  26.981538,    "Aluminum",     "3A"),
	Si(14,  28.0855,      "Silicon",      "4A"),
	P (15,  30.973761,    "Phosphorus",   "5A"),
	S (16,  32.066,       "Sulfur",       "6A"),
	Cl(17,  35.4527,      "Chlorine",     "7A"),
	Ar(18,  39.948,       "Argon",        "8A"),
	K (19,  39.0983,      "Potassium",    "1A"),
	Ca(20,  40.078,       "Calcium",      "2A"),
	Sc(21,  44.955910,    "Scandium",     "3B"),
	Ti(22,  47.867,       "Titanium",     "4B"),
	V (23,  50.9415,      "Vanadium",     "5B"),
	Cr(24,  51.9961,      "Chromium",     "6B"),
	Mn(25,  54.938049,    "Manganese",    "7B"),
	Fe(26,  55.845,       "Iron",         "8B"),
	Co(27,  58.933200,    "Cobalt",       "8B"),
	Ni(28,  58.6934,      "Nickel",       "8B"),
	Cu(29,  63.546,       "Copper",       "1B"),
	Zn(30,  65.39,        "Zinc",         "2B"),
	Ga(31,  69.723,       "Gallium",      "3A"),
	Ge(32,  72.61,        "Germanium",    "4A"),
	As(33,  74.92160,     "Arsenic",      "5A"),
	Se(34,  78.96,        "Selenium",     "6A"),
	Br(35,  79.904,       "Bromine",      "7A"),
	Kr(36,  83.80,        "Krypton",      "8A"),
	Rb(37,  85.4678,      "Rubidium",     "1A"),
	Sr(38,  87.62,		  "Strontium",	  "2A"),
	Y (39,  88.90585,     "Yttrium",      "3B"),
	Zr(40,  91.224,       "Zirconium",    "4B"),
	Nb(41,  92.90638,     "Niobium",      "5B"),
	Mo(42,  95.94,        "Molybdenum",   "6B"),
	Tc(43,  98,           "Technetium",   "7B"),
	Ru(44,  101.07,       "Ruthenium",    "8B"),
	Rh(45,  102.90550,    "Rhodium",      "8B"),
	Pd(46,  106.421,      "Palladium",    "8B"),
	Ag(47,  107.86822,    "Silver",       "1B"),
	Cd(48,  112.4118,     "Cadmium",      "2B"),
	In(49,  114.8183,     "Indium",       "3A"),
	Sn(50,  118.7107,     "Tin",          "4A"),
	Sb(51,  121.7601,     "Antimony",     "5A"),
	Te(52,  127.603,      "Tellurium",    "6A"),
	I (53,  126.904473,   "Iodine",       "7A"),
	Xe(54,  131.2936,     "Xenon",        "8A"),
	Cs(55,  132.90545192, "Caesium",      "1A"),
	Ba(56,  137.3277,     "Barium",       "2A"),
	La(57,  138.905477,   "Lanthanum",    "3B"),
	Ce(58,  140.1161,     "Cerium",       "4B"),
	Pr(59,  140.907652,   "Praseodymium", "5B"),
	Nd(60,  144.2423,     "Neodymium",    "6B"),
	Pm(61,  144.91,       "Promethium",   "7B"),
	Sm(62,  150.362,      "Samarium",     "8B"),
	Eu(63,  151.9641,     "Europium",     "8B"),
	Gd(64,  157.253,      "Gadolinium",   "8B"),
	Tb(65,  158.925352,   "Terbium",      "1B"),
	Dy(66,  162.5001,     "Dysprosium",   "2B"),
	Ho(67,  164.930322,   "Holmium",      "3A"),
	Er(68,  167.2593,     "Erbium",       "4A"),
	Tm(69,  168.934212,   "Thumlium",     "5A"),
	Yb(70,  173.0535,     "Ytterbium",    "6A"),
	Lu(71,  174.96681,    "Lutetium",     "3B"),
	Hf(72,  178.492,      "Hafnium",      "4B"),
	Ta(73,  180.947882,   "Tantalum",     "5B"),
	W (74,  183.841,      "Tungsten",     "6B"),
	Re(75,  186.2071,     "Rhenium",      "7B"),
	Os(76,  190.233,      "Osmium",       "8B"),
	Ir(77,  192.2173,     "Iridium",      "8B"),
	Pt(78,  195.0849,     "Platinum",     "8B"),
	Au(79,  196.9665694,  "Gold",         "1B"),
	Hg(80,  200.592,      "Mercury",      "2B"),
	Tl(81,  204.38,       "Thallium",     "3A"),
	Pb(82,  207.21,	      "Lead",         "4A"),
	Bi(83,  208.980401,   "Bismuth",      "5A"),
	Po(84,  209,          "Polonium",     "6A"),
	At(85,  210,          "Astatine",     "7A"),
	Rn(86,  222,          "Radon",        "8A"),
	Fr(87,  223.02,       "Francium",     "1A"),
	Ra(88,  226.03,       "Radium",       "2A"),
	Ac(89,  227.03,       "Actinium",     "3B"),
	Th(90,  232.038062,   "Thorium",      "4B"),
	Pa(91,  231.035882,   "Protactinium", "5B"),
	U (92,  238.028913,   "Uranium",      "6B"),
	Np(93,  237.05,       "Neptumium",    "7B"),
	Pu(94,  244.06,       "Plutonium",    "8B"),
	Am(95,  243.06,       "Americium",    "8B"),
	Cm(96,  247.07,       "Curium",       "8B"),
	Bk(97,  247.07,       "Berkelium",    "1B"),
	Cf(98,  251.08,       "Californium",  "2B"),
	Es(99,  252.08,       "Einsteinium",  "3A"),
	Fm(100, 257.1,        "Fermium",      "4A"),
	Md(101, 258.1,        "Mendelevium",  "5A"),
	No(102, 259.1,        "Nobelium",     "6A"),
	Lr(103, 262.11,       "Lawrencium",   "3B"),
	Rf(104, 265.12,       "Rutherfordium","4B"),
	Db(105, 268.13,       "Dubnium",      "5B"),
	Sg(106, 271.13,       "Seaborgium",   "6B"),
	Bh(107, 270,          "Bohrium",      "7B"),
	Hs(108, 277.15,       "Hassium",      "8B"),
	Mt(109, 276.15,       "Meitnerium",   "8B"),
	Ds(110, 281.16,       "Darmstadtium", "8B"),
	Rg(111, 280.16,       "Roentgenium",  "1B"),
	Cn(112, 258.17,       "Copernicium",  "2B");
	
	private int atomicNumber; //The atomic number of an atom
	private double atomicMass; //The atomic mass of an atom
	private String name; //The name of the element
	private String group; //The group the element resides in
	
	Element(int atomicNumber, double atomicMass, String name, String group){ //Used to construct new variable of Elements
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
		this.name = name;
		this.group = group;
	}
	
    public double atomicMass() { 
    	return atomicMass; 
    }
    public int atomicNumber() { 
    	return atomicNumber; 
    }
    public String getName() { 
    	return name; 
    }
    public String group() { 
    	return group; 
    }
}
