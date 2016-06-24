package model;

/**
 * Representing character's fame rates
 */
public class Fame {
    private int fyros;
    private int tryker;
    private int matis;
    private int zorai;

    private int kami;
    private int karavan;

    // tribes
    private int ancientDryads;
    private int antikamis;
    private int companyOfTheEternalTree;
    private int corsair;
    private int darkeningSap;
    private int ecowarriors;
    private int firstDeserter;
    private int fraharHunters;
    private int gooHeads;
    private int greenSeed;
    private int iconWorkshipers;
    private int lagoonBrothers;
    private int lawless;
    private int leviers;
    private int masterOfTheGoo;
    private int oasisDiggers;
    private int pyromancers;
    private int renegades;
    private int restorers;
    private int rootTappers;
    private int sacredSap;
    private int sapSlaves;
    private int scorchers;
    private int shadowRunners;
    private int siblingsOfTheWeeds;
    private int siltSculptors;
    private int slavers;
    private int theAridMatis;
    private int theKuilde;
    private int theSlashAndBurn;
    private int tutors;
    private int waterBreakers;
    private int wovenBridles;

    public Fame() {
    }

    public Fame(int fyros, int tryker, int matis, int zorai, int kami, int karavan, int ancientDryads, int antikamis, int companyOfTheEternalTree, int corsair, int darkeningSap, int ecowarriors, int firstDeserter, int fraharHunters, int gooHeads, int greenSeed, int iconWorkshipers, int lagoonBrothers, int lawless, int leviers, int masterOfTheGoo, int oasisDiggers, int pyromancers, int renegades, int restorers, int rootTappers, int sacredSap, int sapSlaves, int scorchers, int shadowRunners, int siblingsOfTheWeeds, int siltSculptors, int slavers, int theAridMatis, int theKuilde, int theSlashAndBurn, int tutors, int waterBreakers, int wovenBridles) {
        this.fyros = fyros;
        this.tryker = tryker;
        this.matis = matis;
        this.zorai = zorai;
        this.kami = kami;
        this.karavan = karavan;
        this.ancientDryads = ancientDryads;
        this.antikamis = antikamis;
        this.companyOfTheEternalTree = companyOfTheEternalTree;
        this.corsair = corsair;
        this.darkeningSap = darkeningSap;
        this.ecowarriors = ecowarriors;
        this.firstDeserter = firstDeserter;
        this.fraharHunters = fraharHunters;
        this.gooHeads = gooHeads;
        this.greenSeed = greenSeed;
        this.iconWorkshipers = iconWorkshipers;
        this.lagoonBrothers = lagoonBrothers;
        this.lawless = lawless;
        this.leviers = leviers;
        this.masterOfTheGoo = masterOfTheGoo;
        this.oasisDiggers = oasisDiggers;
        this.pyromancers = pyromancers;
        this.renegades = renegades;
        this.restorers = restorers;
        this.rootTappers = rootTappers;
        this.sacredSap = sacredSap;
        this.sapSlaves = sapSlaves;
        this.scorchers = scorchers;
        this.shadowRunners = shadowRunners;
        this.siblingsOfTheWeeds = siblingsOfTheWeeds;
        this.siltSculptors = siltSculptors;
        this.slavers = slavers;
        this.theAridMatis = theAridMatis;
        this.theKuilde = theKuilde;
        this.theSlashAndBurn = theSlashAndBurn;
        this.tutors = tutors;
        this.waterBreakers = waterBreakers;
        this.wovenBridles = wovenBridles;
    }

    public void setRacesFame(int fyros, int tryker, int matis, int zorai) {
        this.fyros = fyros;
        this.tryker = tryker;
        this.matis = matis;
        this.zorai = zorai;
    }

    public void setCultFame(int kami, int karavan) {
        this.kami = kami;
        this.karavan = karavan;
    }

    public void setTribesFame(int ancientDryads, int antikamis, int companyOfTheEternalTree, int corsair, int darkeningSap, int ecowarriors, int firstDeserter, int fraharHunters, int gooHeads, int greenSeed, int iconWorkshipers, int lagoonBrothers, int lawless, int leviers, int masterOfTheGoo, int oasisDiggers, int pyromancers, int renegades, int restorers, int rootTappers, int sacredSap, int sapSlaves, int scorchers, int shadowRunners, int siblingsOfTheWeeds, int siltSculptors, int slavers, int theAridMatis, int theKuilde, int theSlashAndBurn, int tutors, int waterBreakers, int wovenBridles) {
        this.ancientDryads = ancientDryads;
        this.antikamis = antikamis;
        this.companyOfTheEternalTree = companyOfTheEternalTree;
        this.corsair = corsair;
        this.darkeningSap = darkeningSap;
        this.ecowarriors = ecowarriors;
        this.firstDeserter = firstDeserter;
        this.fraharHunters = fraharHunters;
        this.gooHeads = gooHeads;
        this.greenSeed = greenSeed;
        this.iconWorkshipers = iconWorkshipers;
        this.lagoonBrothers = lagoonBrothers;
        this.lawless = lawless;
        this.leviers = leviers;
        this.masterOfTheGoo = masterOfTheGoo;
        this.oasisDiggers = oasisDiggers;
        this.pyromancers = pyromancers;
        this.renegades = renegades;
        this.restorers = restorers;
        this.rootTappers = rootTappers;
        this.sacredSap = sacredSap;
        this.sapSlaves = sapSlaves;
        this.scorchers = scorchers;
        this.shadowRunners = shadowRunners;
        this.siblingsOfTheWeeds = siblingsOfTheWeeds;
        this.siltSculptors = siltSculptors;
        this.slavers = slavers;
        this.theAridMatis = theAridMatis;
        this.theKuilde = theKuilde;
        this.theSlashAndBurn = theSlashAndBurn;
        this.tutors = tutors;
        this.waterBreakers = waterBreakers;
        this.wovenBridles = wovenBridles;
    }

    public int getFyros() {
        return fyros;
    }

    public void setFyros(int fyros) {
        this.fyros = fyros;
    }

    public int getTryker() {
        return tryker;
    }

    public void setTryker(int tryker) {
        this.tryker = tryker;
    }

    public int getMatis() {
        return matis;
    }

    public void setMatis(int matis) {
        this.matis = matis;
    }

    public int getZorai() {
        return zorai;
    }

    public void setZorai(int zorai) {
        this.zorai = zorai;
    }

    public int getKami() {
        return kami;
    }

    public void setKami(int kami) {
        this.kami = kami;
    }

    public int getKaravan() {
        return karavan;
    }

    public void setKaravan(int karavan) {
        this.karavan = karavan;
    }

    public int getAncientDryads() {
        return ancientDryads;
    }

    public void setAncientDryads(int ancientDryads) {
        this.ancientDryads = ancientDryads;
    }

    public int getAntikamis() {
        return antikamis;
    }

    public void setAntikamis(int antikamis) {
        this.antikamis = antikamis;
    }

    public int getCompanyOfTheEternalTree() {
        return companyOfTheEternalTree;
    }

    public void setCompanyOfTheEternalTree(int companyOfTheEternalTree) {
        this.companyOfTheEternalTree = companyOfTheEternalTree;
    }

    public int getCorsair() {
        return corsair;
    }

    public void setCorsair(int corsair) {
        this.corsair = corsair;
    }

    public int getDarkeningSap() {
        return darkeningSap;
    }

    public void setDarkeningSap(int darkeningSap) {
        this.darkeningSap = darkeningSap;
    }

    public int getEcowarriors() {
        return ecowarriors;
    }

    public void setEcowarriors(int ecowarriors) {
        this.ecowarriors = ecowarriors;
    }

    public int getFirstDeserter() {
        return firstDeserter;
    }

    public void setFirstDeserter(int firstDeserter) {
        this.firstDeserter = firstDeserter;
    }

    public int getFraharHunters() {
        return fraharHunters;
    }

    public void setFraharHunters(int fraharHunters) {
        this.fraharHunters = fraharHunters;
    }

    public int getGooHeads() {
        return gooHeads;
    }

    public void setGooHeads(int gooHeads) {
        this.gooHeads = gooHeads;
    }

    public int getGreenSeed() {
        return greenSeed;
    }

    public void setGreenSeed(int greenSeed) {
        this.greenSeed = greenSeed;
    }

    public int getIconWorkshipers() {
        return iconWorkshipers;
    }

    public void setIconWorkshipers(int iconWorkshipers) {
        this.iconWorkshipers = iconWorkshipers;
    }

    public int getLagoonBrothers() {
        return lagoonBrothers;
    }

    public void setLagoonBrothers(int lagoonBrothers) {
        this.lagoonBrothers = lagoonBrothers;
    }

    public int getLawless() {
        return lawless;
    }

    public void setLawless(int lawless) {
        this.lawless = lawless;
    }

    public int getLeviers() {
        return leviers;
    }

    public void setLeviers(int leviers) {
        this.leviers = leviers;
    }

    public int getMasterOfTheGoo() {
        return masterOfTheGoo;
    }

    public void setMasterOfTheGoo(int masterOfTheGoo) {
        this.masterOfTheGoo = masterOfTheGoo;
    }

    public int getOasisDiggers() {
        return oasisDiggers;
    }

    public void setOasisDiggers(int oasisDiggers) {
        this.oasisDiggers = oasisDiggers;
    }

    public int getPyromancers() {
        return pyromancers;
    }

    public void setPyromancers(int pyromancers) {
        this.pyromancers = pyromancers;
    }

    public int getRenegades() {
        return renegades;
    }

    public void setRenegades(int renegades) {
        this.renegades = renegades;
    }

    public int getRestorers() {
        return restorers;
    }

    public void setRestorers(int restorers) {
        this.restorers = restorers;
    }

    public int getRootTappers() {
        return rootTappers;
    }

    public void setRootTappers(int rootTappers) {
        this.rootTappers = rootTappers;
    }

    public int getSacredSap() {
        return sacredSap;
    }

    public void setSacredSap(int sacredSap) {
        this.sacredSap = sacredSap;
    }

    public int getSapSlaves() {
        return sapSlaves;
    }

    public void setSapSlaves(int sapSlaves) {
        this.sapSlaves = sapSlaves;
    }

    public int getScorchers() {
        return scorchers;
    }

    public void setScorchers(int scorchers) {
        this.scorchers = scorchers;
    }

    public int getShadowRunners() {
        return shadowRunners;
    }

    public void setShadowRunners(int shadowRunners) {
        this.shadowRunners = shadowRunners;
    }

    public int getSiblingsOfTheWeeds() {
        return siblingsOfTheWeeds;
    }

    public void setSiblingsOfTheWeeds(int siblingsOfTheWeeds) {
        this.siblingsOfTheWeeds = siblingsOfTheWeeds;
    }

    public int getSiltSculptors() {
        return siltSculptors;
    }

    public void setSiltSculptors(int siltSculptors) {
        this.siltSculptors = siltSculptors;
    }

    public int getSlavers() {
        return slavers;
    }

    public void setSlavers(int slavers) {
        this.slavers = slavers;
    }

    public int getTheAridMatis() {
        return theAridMatis;
    }

    public void setTheAridMatis(int theAridMatis) {
        this.theAridMatis = theAridMatis;
    }

    public int getTheKuilde() {
        return theKuilde;
    }

    public void setTheKuilde(int theKuilde) {
        this.theKuilde = theKuilde;
    }

    public int getTheSlashAndBurn() {
        return theSlashAndBurn;
    }

    public void setTheSlashAndBurn(int theSlashAndBurn) {
        this.theSlashAndBurn = theSlashAndBurn;
    }

    public int getTutors() {
        return tutors;
    }

    public void setTutors(int tutors) {
        this.tutors = tutors;
    }

    public int getWaterBreakers() {
        return waterBreakers;
    }

    public void setWaterBreakers(int waterBreakers) {
        this.waterBreakers = waterBreakers;
    }

    public int getWovenBridles() {
        return wovenBridles;
    }

    public void setWovenBridles(int wovenBridles) {
        this.wovenBridles = wovenBridles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fame fame = (Fame) o;

        if (fyros != fame.fyros) return false;
        if (tryker != fame.tryker) return false;
        if (matis != fame.matis) return false;
        if (zorai != fame.zorai) return false;
        if (kami != fame.kami) return false;
        if (karavan != fame.karavan) return false;
        if (ancientDryads != fame.ancientDryads) return false;
        if (antikamis != fame.antikamis) return false;
        if (companyOfTheEternalTree != fame.companyOfTheEternalTree) return false;
        if (corsair != fame.corsair) return false;
        if (darkeningSap != fame.darkeningSap) return false;
        if (ecowarriors != fame.ecowarriors) return false;
        if (firstDeserter != fame.firstDeserter) return false;
        if (fraharHunters != fame.fraharHunters) return false;
        if (gooHeads != fame.gooHeads) return false;
        if (greenSeed != fame.greenSeed) return false;
        if (iconWorkshipers != fame.iconWorkshipers) return false;
        if (lagoonBrothers != fame.lagoonBrothers) return false;
        if (lawless != fame.lawless) return false;
        if (leviers != fame.leviers) return false;
        if (masterOfTheGoo != fame.masterOfTheGoo) return false;
        if (oasisDiggers != fame.oasisDiggers) return false;
        if (pyromancers != fame.pyromancers) return false;
        if (renegades != fame.renegades) return false;
        if (restorers != fame.restorers) return false;
        if (rootTappers != fame.rootTappers) return false;
        if (sacredSap != fame.sacredSap) return false;
        if (sapSlaves != fame.sapSlaves) return false;
        if (scorchers != fame.scorchers) return false;
        if (shadowRunners != fame.shadowRunners) return false;
        if (siblingsOfTheWeeds != fame.siblingsOfTheWeeds) return false;
        if (siltSculptors != fame.siltSculptors) return false;
        if (slavers != fame.slavers) return false;
        if (theAridMatis != fame.theAridMatis) return false;
        if (theKuilde != fame.theKuilde) return false;
        if (theSlashAndBurn != fame.theSlashAndBurn) return false;
        if (tutors != fame.tutors) return false;
        if (waterBreakers != fame.waterBreakers) return false;
        return wovenBridles == fame.wovenBridles;

    }

    @Override
    public int hashCode() {
        int result = fyros;
        result = 31 * result + tryker;
        result = 31 * result + matis;
        result = 31 * result + zorai;
        result = 31 * result + kami;
        result = 31 * result + karavan;
        result = 31 * result + ancientDryads;
        result = 31 * result + antikamis;
        result = 31 * result + companyOfTheEternalTree;
        result = 31 * result + corsair;
        result = 31 * result + darkeningSap;
        result = 31 * result + ecowarriors;
        result = 31 * result + firstDeserter;
        result = 31 * result + fraharHunters;
        result = 31 * result + gooHeads;
        result = 31 * result + greenSeed;
        result = 31 * result + iconWorkshipers;
        result = 31 * result + lagoonBrothers;
        result = 31 * result + lawless;
        result = 31 * result + leviers;
        result = 31 * result + masterOfTheGoo;
        result = 31 * result + oasisDiggers;
        result = 31 * result + pyromancers;
        result = 31 * result + renegades;
        result = 31 * result + restorers;
        result = 31 * result + rootTappers;
        result = 31 * result + sacredSap;
        result = 31 * result + sapSlaves;
        result = 31 * result + scorchers;
        result = 31 * result + shadowRunners;
        result = 31 * result + siblingsOfTheWeeds;
        result = 31 * result + siltSculptors;
        result = 31 * result + slavers;
        result = 31 * result + theAridMatis;
        result = 31 * result + theKuilde;
        result = 31 * result + theSlashAndBurn;
        result = 31 * result + tutors;
        result = 31 * result + waterBreakers;
        result = 31 * result + wovenBridles;
        return result;
    }

    @Override
    public String toString() {
        return "\tFame{" +
                "\n\t\tfyros=" + fyros +
                "\n\t\ttryker=" + tryker +
                "\n\t\tmatis=" + matis +
                "\n\t\tzorai=" + zorai +
                "\n\t\tkami=" + kami +
                "\n\t\tkaravan=" + karavan +
                "\n\t\tancientDryads=" + ancientDryads +
                "\n\t\tantikamis=" + antikamis +
                "\n\t\tcompanyOfTheEternalTree=" + companyOfTheEternalTree +
                "\n\t\tcorsair=" + corsair +
                "\n\t\tdarkeningSap=" + darkeningSap +
                "\n\t\tecowarriors=" + ecowarriors +
                "\n\t\tfirstDeserter=" + firstDeserter +
                "\n\t\tfraharHunters=" + fraharHunters +
                "\n\t\tgooHeads=" + gooHeads +
                "\n\t\tgreenSeed=" + greenSeed +
                "\n\t\ticonWorkshipers=" + iconWorkshipers +
                "\n\t\tlagoonBrothers=" + lagoonBrothers +
                "\n\t\tlawless=" + lawless +
                "\n\t\tleviers=" + leviers +
                "\n\t\tmasterOfTheGoo=" + masterOfTheGoo +
                "\n\t\toasisDiggers=" + oasisDiggers +
                "\n\t\tpyromancers=" + pyromancers +
                "\n\t\trenegades=" + renegades +
                "\n\t\trestorers=" + restorers +
                "\n\t\trootTappers=" + rootTappers +
                "\n\t\tsacredSap=" + sacredSap +
                "\n\t\tsapSlaves=" + sapSlaves +
                "\n\t\tscorchers=" + scorchers +
                "\n\t\tshadowRunners=" + shadowRunners +
                "\n\t\tsiblingsOfTheWeeds=" + siblingsOfTheWeeds +
                "\n\t\tsiltSculptors=" + siltSculptors +
                "\n\t\tslavers=" + slavers +
                "\n\t\ttheAridMatis=" + theAridMatis +
                "\n\t\ttheKuilde=" + theKuilde +
                "\n\t\ttheSlashAndBurn=" + theSlashAndBurn +
                "\n\t\ttutors=" + tutors +
                "\n\t\twaterBreakers=" + waterBreakers +
                "\n\t\twovenBridles=" + wovenBridles +
                "}\n";
    }
}
