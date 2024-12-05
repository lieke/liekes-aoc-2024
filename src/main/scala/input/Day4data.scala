object Day4Data {
  val input: List[String] =
    List(
      "XMSSMXMSMXASAMMXMXMSSSMMSMMMSXMAXXMSMSMXMAXSXSXSMMXSXMSSXMAMXMMXXSXSAMXASXMXXAXSXSXXMMSAMSSSMSMSAMXXXSXSMSSXSXMSAXMMMSMXSAMXMXSAMXAMAMXMXXXX",
      "XSAAXAMMAXSAMSMSMSXAXAAXSAAAAMSSMMMAMAMXXMAMAMMSASXMASAXXSMXSSSMMSASAXXMSAMASXMMMSMXSAXAXMAMAAMMMSSMMSAAAMAASAMXSAAAXAMXMMMXSAMASXSSMSMMMXMM",
      "MMSSMSAMXMAAXXAAAXMASXMMSSMXSMAXMASASXSMMXSMAMAMAMXXMMMAXAMXXAAXAMMMMMMXSAMAXAAXAXAAMMSMMMAMMMSMAAAAAMMMMMMMMAMAMSSMSMSASAMXMMSMMAASAAAAAAAA",
      "XAAMAMSXMASMMMSMSMAMXAMMMASXAMAMMMSXSMMAXAMXSMSMSMMMAAXSAMXSMSMMSXMAAAXASAMAMSSMMSMMSXMMAMAMAAAMMSSMMSAXAAXMXMMMMAMAMXAASXSSXXAAMMMMSMXXSSSS",
      "MMXSAMMMMXMXAXXAAAXASXMAMAMSXMSASASASASXMXSAMXMAXAXSXMSXXMAXXXMAMASXSSMMMXMXMMAXXAAXXMASXMAMSMMSXMAXASMSMSSSXXAXMXSMAXXXMAMAXSSSMSXMXSSMXMAX",
      "AXMSMSAASAMSXMMSMSXMSAAMMSXMMMASMAMASMMXAAMXSAMXMSMSASXMAMSXSASXMMMMAMMMMSXMASXMMSSXSMMMAMSXXAAXMXAMXSASAMAMMSMSMAXMAXSAMAMMXMAAAXXXAXXAXXAM",
      "ASMMXSMXXAMMAMAMAXMASMMMAMAAASMMMSMMMMSMSMSASXMXAAAMMMASXMAAMAAXXAXMASAAASAMAAASXXMXXAAMXMMASMMMSMAXMMAMMMASAAXAMMSMSSXASAMXAMSMMMSMMMMSMMSS",
      "MXAMMMMSMSASMXSSXXMXSXSMXSSSMXXSAXXXAAAAASXMSAAXSMSMASAMAMMSMAMMMMMSAMXSXSAMXSAMMAMMSXMMAXMAMAMAXMXMAMAMXSASMSSSXMAAXMXMMMSSSXMAXAAMAAAAAXAM",
      "MSSMAXAAXXMXAMMXMXXXMASAXAAXAMSMMSMSSSMSMSXXSMSXMAXMXMAXSMAMXSAAAAAMASAMXSAMAMAASXSAMASXMXMASXMMSMMAMSASMMASAMAMASMSMSMSAMMMXMMMMMSSSSSMSMAS",
      "XAXSMMMSSSMMSMSASMXAMMMXMMSMSMSAXMAAMAMXXMMMMAMXMAMSMSSMMXXSAXXSSMMSMAAMASAMXSSXMXMMSAMASMSAMAAAAAASXSASXMAMXMAMMMAAXAXMAMXSAMSSSMXMAMMXXMMS",
      "MMXAXSMMMAAXAXSAAASAMXAXMXMAMASXSMMMXXMXAXAMMAMAASMSAAXXSAMMXSMMAMMMAMSMXSAMXMAXMAMAMASAMXMXSSMSMXSAXMAMMMXSSSMSAMSMSMSSSMMMXSAAAAXXSXSMSMSS",
      "SSMSMMAASXMMMXMSMXXAXMMXMAMXMXMASAXMASXMSSMXSASXSMAMMMSAMASAMXXSAMXXMXMMXXXXAXAAMAMAMXMXSXMMAMAMXMAMXMXMASAXXAASAMXXMXXAMXMSMMMXMMMAMAAAXXAS",
      "MAAMASXMMXAAXAAMXMMMXXAAXAMAMAMSXMAMAXAAMXXXSXSXXMSMMAXMMMMMSMMMAMMXXAASXMASMMSXMAXXSMMMMAXMASMSMXAMXMXSAMXSMMMMAXXMSMMAMMAAAAAASXMAMSMMMMMS",
      "SMMMAMXAAXSMMMMMAMAMMMSMMAMASXSAAMASXMMMMAMMMMSXMAXXSXXMAAAXAAMSSMAMSSXMAXAAAAAXSSSMAASASMSAMXAAMSMMXAAXASASXMASXMXAAASAMMSXSMSXSAMXMAMAAXAS",
      "SAMMSMMMSAMXMAMSMSAAAAAMSMXMSXSMASASAMAMMAMXAAXXXXMAMXASMMXSSXMAAMXMAAASMMSSMMSMXAAMSMMAAAAMXMMMMAASMMMXAMXXAMXSSSMMSXMXXXMXMAXMSAMXMAXSXSXS",
      "SAMSAMXAXMASMAMAAXMSMSSMASAAXAMXMAXMXMAXMASXMSSMMXMAXXXMMSMMMSMMSMMMSXMMAAXXMAXXMSMMMXMSMSMMSXSXMMXMAAXAXMSMSMSXAXAMXAMXSAASXMSXSAMXSMMXAMXS",
      "SMMSMSMMSMAMXMMMSMAMAAMMASMSMMMMMMAMASXXSASXMMAXAXMMSMAMAAAAAXXAMMSAMASXXSXAXSXMAXMAXAXXMMMMAASMXSASXMMSAAMAMXSMMMSMXAXAXMMXAXXMMAMAAAAMASAM",
      "XAAXMXAXXMASAMAAAMAMXMSMXMXAMXAAAXMSXXAXMXMASXMMMXMAAXAMSSSMSSMXSAMASAMSMMMSMAAXSXMMMSMAXAMMMXMAAAAXXAAXMAMSMMSAMAASMMMMMXAMMMSXSAMXMMMSAMAS",
      "XMMSSSSMMXAMASMSSSMSMAXMAMXMSXMXSSXMAMSMSAMXMAMSMSMSSSXMMAMXXXASMAMMMXMAXMAMASXMMMXMAXSMMXXAXAXSMMAMMMSSMAMAAASAMMSXMXAXAMXSMASAXSXSMMXMASXM",
      "XAAXXAAASMSXMMMAMAAAMMMMMMSXMASXMMAMMMMASAMSSSMAAAAMMMMMXAXMAMMMSXMAAMSMSXAXMXMAXAXMAXAXMMMSXXXAXXAXAMXXMASMMMSXMXMXMMXMXSAAMAMAMMMSAMSSMMAM",
      "MMMSMMMMMMMASXMMSMMMMAXXAXAAMAMMASXMAAMAMAMAAMXMMMMMAAMSSSMMAAMXXXMMSMAMSXMSMMSSSSSMSSSMMAXMASXSMXSSSMSSSMXMAMSXXAMAMSMAAXXXMASAMXASAMAAXSXS",
      "SASAAAMASASAMAAAAAMXMAXXASMXMAMSAMASXXXAMASMSMSSMSAXXMSMMMASMSSMMXSAAMAMMAXAAMAXMASAXXMAMSAMXMAMAAXAMAAAAMMSAMMMMSSXSAMSAMXXMASAXMMMAMSSMSAA",
      "MXSMSXSAMMMASXMSSMMSMAXXAMXMSSMMMSXMASMXSAMXMAAAASMSSMSAAXXMXMAXAAMSMSMSSMMSXMXSMMMXMASAMMMMSMMMMMMAMMMXMMAXXSMAXAAMSXMXAMXMMMXXXMSSXMXMXMAM",
      "MMXXAMMAMXSXMAAXAASMMAXAAXMASMXAMAXMXMAMMMMAMMMMMMASAASMMSXMASXMMMMAXAMAASAXMSMMMXMMSAMASMXAXMXXSMMSMMSSSMMSAMXSMMSMMASMMMAMSSSMMXAAXSMMMAMX",
      "XSAMXXXAMAXAXMMMSMMAMAXSAMMSMXSMMAXMMMXMAASAMXSAXASXMMMAXAASXSMASXXXSSSSMMSMXAAAXASXMASAMMMSSMSAMXMMAAAXAAAMAMAMXXAXSXMAXSASXAAAAMMSMSAAMMSM",
      "AMAMSASXSMASXAXXXMSSMMMXAXXXXMAAMSXSAAXMSMXXSAXXXSAMXASXMSXMXSASMMMXXAAAXSMXSXSMSXSASAMAMAAMSAMXMASXMMSSMMMSMMXSMXMASASMMSSSMSMMXSAMASMMSAAA",
      "MSAMMMSAAMAXMMMSMXAXAMSSMMSXMASXMXASMSMAAAMSMXMXMAMSXMXAMXASAXXAAAMASMSMMXMAXAAAMMXXMASXSMXSMMMSSMSXASAMMAAAXMXMASXMSAMMASASAMAAAMAMXMASMMSS",
      "XSXSAAMMMMMSAXAAXMASAMXXMAMAMXMXSMMMAMASMSMAASMSXMASASXMSSXMASXXSASXSAAXAAMAMSMMMMXSMMXMAMXMASAXMASMMMASXMSXSXMMMSXMMAMMSMAMXSAMXMAMASXMAMMM",
      "MXXXMSSSXMASMMSSMSAMXXXMASMXMAMXXAXMAMMMXXMMXMAAAMASAMAAXMAMAMXXMMAMMMMSSMMXXXAMXSAMASXSAMXSAMMSMAMAXSMMXAMASMMAASAMMSXSAMXMXSMMSSMSXSXMXSAM",
      "SXSXSAAMAMMSXMAAXMASMMSAAXMAMAXASXMMSSMXSASXSMSMMMASASMMMSMMASAAMSAXSXMXXSMMMSAMAMASMMASXMXMXSMAXSSSMSMMMSMAMASXSXMMAMMSASXMAMAAXAAMAMAMAMAX",
      "MAMMMSSSXMXMMMMXXXAMXXAMXXMMSSSMSAAXAAXAMXSAAAXAXMXXAXAAAAXASMMMAMMSMXMSMAMAMXMMASXMXMAMASXMXMMMXMAAAXAAAAMXSXMMAMSMMSASAMAMXSMMMAMMAMAMMMSM",
      "MAMAAMMMAXSXAXMASMMSSXSSSMMMMMAASASXSMMSMAMXMMSSMSASMSSMSSSMAXAMASXMXAXAAXMXSAXXAMXMAMASXMAXXMASXMSMMMSMSSSXMASMMMXAAMMSMSSMMMMMSMMMAMXSXAXS",
      "SSSMXSASAMASXXSAMAMXAAAAXMXAASMMMAXAAXSAMAXXXAAXASAMXAXAAAAMMMXMAMAASMSMSASAMAXSASASAXMSMSXMXSAXXAXMSAAAXAMMMAXMSMSMMSAMXXMASAAXAMSMXSMXMAXA",
      "XXXAASASAXMASXMASXMSSSMMMSSSXMASMMMSMMSASXSMMMSSMMAMMXMASMXMAAAMXXMMAAAAMMAAMAMSASMXSASMXSSXAXXSMXMXMXSXMMXAMMSMAMSAASXSMMSAMXSMSMSAASXMASAM",
      "SAMMMSMMMMXXAXMAMXAAAXXXAMAMASAMAXAAXXSXMXAXXAXMMAXXMXSMXMASMSMMSAXSMMMSMSSXMXMMAMXAXMAXAMMMMMSAMXSASAXASXMASMAMSSSMMSAXAAMASAXXMAMXMMAMAMAX",
      "SXMMAXMXSSSMASMSSMMMSMSMMXAMAMXMSMSXSMMSSSXSMMMSXMMSXAXMASAMXXAASAAMSMSXMMMMSXMMAMMMSXSMSMMAMSXMASXAMAXMMMXSSMSSMAXMSXXSMMSAMXSAMAMAXXXMASMM",
      "SAXSMSMSMAAMMMAXXXAXXMMAASMMSXMAXAXAMXAAMAAXXAASMSASMSMSAMXMSMMMSAMXAXMAMMSASAASASAXMAMAAASXSMMMMMMMMMMAAASAMXMAMXMXXAXXMAMASXXXSASMSMSSXSXA",
      "MAMAXAMAMSMSAMXMMXSXMASMMSXAMAMAMAMSMMMSSMSMSMMSAMXSAAMMMSAMXAMAXMASMMMAMXMAXXMAMSMSXXMMMXMMAMASASAAASXMMSMASMSXMAMMMMMMMXSXMAXMXXSAAAAAAMMM",
      "SAMMSXSAXAXSXSXAXMMAAXAMXXMMSAMSMMMAXSMMXXAAXXXMXMAMMMSAASXSXSASMXMMASXMMXMAMMAMXSMMMMMXSXSAMSMMASAMXXSAMXXASXMASXMAMXAXAXXMXSAXXAMMMXMMMMAX",
      "SMSXAASMSMXSMMMSXAMSMMASAMAXMXMXAXSASAMXMSSSMMXSXSXXAXSXXSAMXMAMMMSMAMASMSMAXSAMAMAAAASMSASMXSXMXMMSSMSMMXMMMASXMMSSSMSSMSAMXAAASXSAMXSSMSSS",
      "XAAMMXMAAXASASAMMSMAASAMMMAMMAMXXMASMXXSXAXAAXXXAMXMXMXSMMXMMMAMAAAMASMAAAMAMSAMSAXSXXXAMAMSAMAXSAAXMASXXSMMMAMXMAMMAXMAMMAMMMMMAAAASMMAAAAX",
      "MMMMSMMSMSASXMASAXMXMMASAMAMMAXSAXXXXMXAMXSMSMMMMMAMXAAXXAXMSAASMSSSMSXMMMMSXSXMXAMXXSMSMXMAMSAMMMMSMAMMSMAAMSMSMSSSSMSMMSAMAASXMMSXMASMMMSM",
      "MSAAAAAAAAMXASAMXSMSSXXMAMAXMASMXMMMAXSMMASAAMXAAXAXAMSMMMSXAXMAXAAMMMAXXSMMASMMMSMSAXAAXSMXXMASXAAXMASXAMMMXXAAXXMAAXSAASXMSMSXXMAXMMMMMXXA",
      "ASMSXXMMSMXSXMASXMAAAXSSSMASXXSXXMMMMMAXMAMXMASMSMSAMXMAAAXMMMSXMMSMMSSMASAMAMAXSAAMMMSMMMSMASXMXMMMXAMMXXSMMMSMSSMSMMSMMMXAAMMMMXMXMAXMMAXS",
      "AXXAXSAMMXAAAMSSMMMMSMAAXMAMXASAXSAASAMXMXMMXAXXXAAXAMXMMXSAAAXAXAXAAAAAASXMASMMMMMMXMXSXAASMMXAAXASXSSXSASAAXXMAXMAMAMXAMSSSXSAMAMMSSSXMXSX",
      "MAMAMSAMASMSMMMXAMMXMAMSMSMXMXMAMSSSSSXSMSSSMMSXMXMXMASXSXSXXSSSMMSSMSSMMSMSXMMAXAAMMMAMMXMSXAMSMSMSAAAAMAMXMXAMXXXMMAXMXMAAXMMMSASAAMXXXMXM",
      "SXMSXSXMASXXMAXXAMXAXMAXAXXXSXMXMXMMMMMAAAAXXMAXAAMXXSAXMAMXMXXMAXXXAAXXSXAXAMSXSMXSAMASAAMXMMXAAAXMMMMMMMMASMSMMSSSSSSMMMMSMSSXSMSMSSMXMMAA",
      "MXMMASXMASMMSASXXASMSSMMSMMASXMXMASAAASMMMSMMXSMSXSAMXXAMAMAMXSMSMXMMMMSAMXMSMSASAXSASXSMMMAMXSMSMMXMXXMASXMXAASAAAMXMAMASMMAXMASAMAMAXXAMSM",
      "AMXSAMMMMSMAMAXXMXMAAAAAMAMSXAMXSASXSMSXSXAXSAXAXAMMSSSMSASASXAMAAXSSXMXXXSXMAMAMAMSAMXSAMXSAMSXAXSMXMXSASAAMSMMMMSMMSXMXMAMSMMAMAMSMAMSSMXX",
      "SAAMAMAMXMASMSMASMSMSSMMSXMMSAMMMXSAMXMAXMAAMAMXMSMAAXAAAASASXMSSSMAMAMXMXMAMSMMMMMMAMXMAMXMASMMMMAXAAAMASMMMMAXXAMMAAASMSMMXAMMSXMAMAMSMXSA",
      "AMSSSMXSAMXMAMAXAAAAAAAXMMAXMXSXXASMMXMAMMMSMSMXXMMMSXMMMXMXXAXAMXAASAMMMAMXMAAXXXXXSXMSAMXSMMMAAAMSXSXMXMXSASMMMSSMMXMMAAXSXSAXSMMMSMXXAAMM",
      "MAMAAASMMMXXXXXMMSMMSSMSMSSXMSAMXMMAMMMSSXAMAMMSMXMAMXXAXXAASMMMSASASAMASASASMSMMMMMMAMMMXMAXASMXSXSAMXSXMXXAXAAAXXXSMAMSMMXAXXXMAXXXMSMMMSX",
      "XSMMMXSAASMSMMSMXXXMAMXSAAAASXMXSXSXMMAAXMXMAMXAAXMAXAMXXSMMAAXXMAMASXMXSAXXSAAMAAMAMXMAMSASXXSAAMAMAMAAAMSMMSMMXXMASXMMMXAMXMMMSXMASMAAAXMX",
      "XXAXSAMMMAAXAAAXMXAMXXAMMMSMMAXAMAMMSMMXMSXMASMMSSMSSSSSMXSMXMMMMXXMMMMMMMSAMXMMSSMAMSASMSAMMAMMMMAMAMSSMMAAXSXSSSMASAMMSMMMMAXAMAMAASMSMSSX",
      "ASMMMXSXMMXMMSXSMSSMSMSSSMXASXMSMAMAMMXSAAXSASAXAXAAXAAAXAXXMXMSASMXMAMAAMMMSSXMXXMASMAXXMAMMAMASMXMXAAXASXXMMAMAXMAXAMASXAASAMASXMXMMXMMSAS",
      "MXMAMXSAMSMSMXAAAAXAAAAAAASAMAAMMMXSAAAMXMXMASMMASMSMMSMMASMAAXXASAAMSMMMSAAAAASASMXMMAMMMMMXAXMMMMMMMMMXMMXSXMMMMSASXMAMMMMSAAMMXMMXMAMXSAM",
      "XAMASAMXMAASAMSMMMMSMSMSMMMXMMXMASMMMMMSAXXMXMXMMSXAAXAAMAXAXASMMMMMXXAAASXMMSMMASMSXMASAAASMMSSMSAXSASASXSAMAMXXAMAAXMSSXSAXMXAXAXAAMMSAMAM",
      "SXSSMMSAMMSMAAMMASXMAXXMAXMXSXXSASASMMAMMSAMXAXMAMXMSSSSMMXSAAMAAAXXASMMMSASXMXMXMASMMASMSMAASAMASAXSAXAXAMMSSMSASMMMMAMAAMAMSSMSMMSMXXMASMM",
      "MMMXAAAAMSXXMMMSASAMXMASXMXAXMAMXMXMAXSSXMASXSMMMSSXAAAAAMAXMMSMMSSMAXXAMXAMAXSSMMAMXSAXAXXSXMASAXXXMAMSMMMXMASAXMXSSXAMMMMXMAAXAMAMMMXXASAS",
      "MAAMSMMSMMAXMAMMMXXMAXMSAMMMMMMMAMSASAMXASAMXMMXXAAMMSMSMMMXXMAMSXXMASXMMMXMSMASAMXSAMASXMAXXSMMMSMXMAMXAASASMMMMMXMMSMSSMMSMSSMMMAXAASMXSAM",
      "SMSMXAAXMMXMMASMSMAXMXXXAMSAMMAMAXMAMMSSXMAMSXSSMXSAMMAAXAXMXMAMMASAMAMSASAAMMXMSXXMASAMAMXMAAXAXAAAMAMMSMSASXAAMAMAAMXAAAAXMMMMXMSSSMXSAMAM",
      "XAXXSMMSAMSXSMXAASAASMSSSMMAMMAMSSMAMAMMASAMAAAXMAXAAAMMSSSMXASXSAMAMAASASMSMSMMMMMSXMASAMMMAMXMMSMSMMMMMXMXMMMXMAMMXMMSSMMMMXAXXMAAASAMXSXM",
      "MXMXXAXSAMAAXAMSMMSSMAXAMXSAMSSMMAMXMASAAMAXMMMAMMSAMXXMXMAMSXXAMXXXSMMMXMAMMMAMXAAAMSXSXSAMSXSSXMAAMSAMSSMMSSSMSXSASXMMXAAAMMMMMMMSMMXSXMMS",
      "XAMXSXMSAMMMMXMAAXXXMMMSMAMAMAAASXMASXSMMSSMXSSSSMSMSMMMASAMXMMMMAMXXMSMMMSMXXSXXMMSASMMMMASMAAXAMXMASASAAAAASAAAAMAMAASXSSXSAAAXMAMXMMMAMAM",
      "MSSMMAASAMAAMXSMSMMMMSAMMSSXMMSMMAMXMMMXMAXMXMAMXAXAAAASMMASXAMASMXXASAAAMAAXSASXXMAMXAASXMMMMMMXMAAMSXMAXMMXMMMMXMASMMMMMAMSXSMMMASAXASAMAS",
      "SAAAMMMXMXSMSAAXMAXAAMAMAMMMSAMXXMXAXAMAMXSAMMASMMMMMSMSASAMMSMAXXASMMSSMMMSMMAAMMSSMXSMSAMXXAXAMSMSMSMSSSMSSMSSMXSAXMAAMMMMXAMASXMSMSXSAMAA",
      "MSXMXSMMSAAAMMSSSMMMMSXMMMAAMAMXMASXSMXMSAAAXXAMAXAMAMXSAMXXAMMXSMXMSAMXMXSAXMSMSXAAAXXXSAMXMMXSAAAXXXAAAAMAAAAAXXMASXSMXSXSMSMAMAAXASMMMSMM",
      "MAXXASAAMMMMSAAMXAAMMMAMAXSSMSSSMAAAXXASMMSSMMSSMMSMMSAXXMMSSSSMAMAMMMMAMXAAXXXXAXAMXMSASAMXAAAXMMSMMMMMSMMSXMXMMSMXMXXXMXAMAXMMSMMMXMASAAAX",
      "MSSMASAMXAASMMXSSSMSAMAMMXMAMAAXMMMXMMMSAXMAXAAAAAXASMMSASAAMAAAMMAXAAXAXAMXMXMMMXMXMAMXMAMSMSMSAMXAAXAXMXMMAMMSMMMMSAMAXMAMSMAXXXXMASXMXSXM",
      "SAXMAMAMMSMSAAAMXAXSASMXSASAMMSMXAMASXMSMMSMMMSSMMSSMAASAMMSSXMMMSXXMXSMSMXAAMSAMASAMSSMSSMXXXASXMSXMSMSMSAMXMAAAAAXMASAMXAMAXMMSMMSASAAMXMX",
      "AMMMXXXMXXSSMMXSAMXSAMMASASXSXXMSMSAXAAXAAXXXMAMAAXXMMMMMMMAMASXXXMASMMMAMSMMAXASASXSASMAXXXMMMMAMXMXAMMASXMAMXSSMMXSAMAXSASMMSAAMAMXXMMAMXM",
      "MXMXMASXXMASXXXMXMAMMMMAMMMASAMAAAMASMMSMMSMXMASMMXSMSXSAXMASAMAXMMAAAXSAXAAXSSMMMSXMAMMAMMSAAASASAMSAMXAMASXSAMMAAAMAMAMXAMAAMSSSSSSXMMAXAA",
      "XMMAAXMASMAMMSAMXMXSAXMASAAXSAMSMSMAXAXXXAAXAMXSASMAAAAXASXMMMSSMXMASXMAMMMSMMAMAAXAMAXMAAXSXSXXAMAXSAMMASXMAMAMMMMMSAMMMMSSMXMAMAXAAAXSXSXS",
      "XSSSSSXMXMXSAMAXAXAXXXMAXMSMMMMAAMMXSSXMASMSSSMSAXSMMMSMAMXAXAAAAXMMXMAXXMXXXMASXSSXSAXXAXXSAXASXSSMSXMXXMMMMMASXMSASAMSAAXAXSMAXSMMMSMSAMXM",
      "AXAAAAXXAXMMMSMMMMMSMSMSMSAAAMSMSMMAXMAMAAXSXAXMMMMMAAXMAMSMMMSSSSSMSMXXAMXMAMXSAAAASAMSSMMMAMAMAAXAMAMMSAMAMMMSAAMASAMMMMSMMSSSMXXXAXMMAMAM",
      "MMMMMMMSMMAAMAXMAAMAAXAAXMSSMXAXXAMMSSMMSSMMSAMXSAXXMSSSXMMMAXXAXXAASAASXMAXMXAMMMMXMAMAMMXMXMAMMMMXXAMXSAMMSAAMMMMAMAMMSXMXMMAXAXMMMSAMXSMS",
      "MAXXXMASXMXXSASMMSSMSMMMMXAXXSXMSAMAAAXAAAAXSXSAMXSAMXMASMMSXSMXMAXMMXMSASXSXMASAXXSSMMAXMAXSMXSXXXXXXXMSXMASMSMAXMASXMMSAMSXMAMMMSAMXAAAAMA",
      "MXMXXMASAXSAMMMAMXAXXXMASMAMMXMAXXMMXXMMSSMMMMMXMASMMMXAMMAXMAMXXMXSXXXSASAAXAMXMAMAASMMSSSSSMMSXMXMASMMMAMXMMMMAXXAXAMAXAMAXMASAASXMMXMXMSM",
      "SSSMXMASAMMAMXMXMSAMXAAAMMMMXXAMXSSSSXSAAMXMAAAAMXMAAAMXMXAXSAMXSMASXSAMAMXMXXMASXMAAMSAMXMAMAAMAMAAMAASMXMXSAMXMAMMMSMMSSMMMSAMMXSXMXMSMXMM",
      "XAAXXMXMXMMAMXASASXXSMMXSASAXMSMAMAAMAMMXSASXSSMSMSSXSMMSMSMSASXAMASAXAMXMXXMASAMXMMSMXMSXMAMMMXAMMSMSAMXMSSMMSAMSASAAAXAAMXXMMXSAMASAAAAAXA",
      "MSMMXSAMMMMSSMXSAMXXMASMAAMXMXAAAMMMMAMAASASAXMMAXMAMAXMAAMAMAMMAMXSMSMMMMMSSMMMMSXAXAAMSMSXSASMMXAXAAMAMXMAXAXAMXAMMSMMSSMSMMMAMXSAMMSMMXSM",
      "MAXAXXAMXSAAAXAMAMXXMAMAMMMXMSASMSMMSASAXMAMXMAMMMMASAASMSMSMSAMXAXSXAXAAAAMAAASASMSSMMMSAAAMAXAXMXSSMSAMASMMMSSMMXMAMAMXAASASMSXXMASAMXSMMM",
      "SMMSSSMMAMMSMMXMMMXMMASXXAMAMAXMAXMASXXXXMXMSMMMSASXMMMXAAAAXXXMXXXMASMSSMSSMMMMASAMXMMAMMMSMXXMMSAAAXSASASXXXAMXXSMMSAMSMMSSMAMMMSAMAMAAAAA",
      "XAAAAAAMAMMXXXSAMXAMSASASAMASMSMSMMMMMXMAMAMXMAAXMSXSAXMSMMMMXXSASMSMMAMAMXXXAXMAMAMSMMAXXMMMAAMAMMSMMSMMASAXMXSMMMAASAMXXAMXMAMAASASAMSSSMM",
      "MMMMXXMSMSMMMASAMMMMMASAXXSMMXXAAAAAAMAAASASASMSSXSAMXSXXASXSMAMMSAAXAAXASXMSASMASAMXXSSSSXAMSSMASAAXMMMMMMMMMASAASMMMXXMASAMXXSMMMMMXMAAXMM",
      "XSSMXSAMAAMASASAXSAAMMMXMMXMSSMSMSMSMMXXMMASXSAMAMMSMMMMXMMAXMAMXMXMMSMMMSAMSSMMMSASAMXAAXMXMAMMXMMSSXMAAXAXAMASXMMMAMSMSAMASMMMASXXAMXMSMSA",
      "MAAAAMXMSMMXMASXMSMMXAMXXMAMAAAXAXAXMSMSXSAMAMXMMSAXMSAAXSMMMSMSAASXMASMMSAMSAMXMSAMMMMMMMMSSSSSXSAMAASXSSMSMSASAMXMAMMAMXSAMAASMMXSAMXXMAMX",
      "AMMMMMAAMMMSMMMAXXASAMXSASAMMMXMMMSMMAAAAMAMSMSSXMASASXXMAAMAAAXMXSASASMAMXMSAMXXMMMMXMAAAMMAMAMAXSMSMMAMXAAMMMSXMAMMXMAMXMXMMMXAAXSMMAMMSMM",
      "SXMSSSSSMMAAAASXMMAMAMAMMMASXAXMAMAASMMMSMSMMAXAXMAMXMASXSMMSMSXMAMAMASMXXAMXAXXMASMMAMXSSXMSMMMMMMXMXMMMMXMSMMMXMXMMAMAXMSAXSSXMMMSMMXXAAAX",
      "AAMAAXAAMMSSSMXMAAMSXMASXSXMAAMXASMMMASAMXAAMAMMMMASMMMXAAXMXAXXMSSSMMMASMSMMXMMMXMXSAMXAMMMMAAMAASASXMXXMSMSAAMMXMASMSXSAMXMXAASAMXASXMXSMM",
      "SMMMSMSAMXMAAMXMSMMMAMXMMAAXSMXSASMXSAMXSSXSMAAXAXMXXAMMSMMMMSMAXAAMAMMXMAXAMSMSMAAAMAMSAMAAAMMSSXSASAMAMMAASXMSMSMAXMAAMXMAMMXMMASMMMAXAMXX",
      "XXXSXMXXAMMSMMAMAAAMXMXMASMMXAXMMMMXMXSSXMAAXXSMSSSMSASXMASXAAMAMMXXAMMXXAMXMXAAXMXMMAMSAMSSMSXXMMMXMAMASMMMMASXAXMXMMMMMASMSXMMSAMASXSMSSSS",
      "MMMSAMXSMMMAASMSSSMSAXXSAAXXMSMMSAMAMXMXAXMASXXAXAXAMXAAMSXMXMSMMXMXSSMSMXMASMSMSSMXSAMMAMXAASAMXAAAMMMASAMASXMMMMSAAAXASXSAAXMAMAXMMAMAXAAA",
      "XAXMAMMSAAXSXMAAAMASMMMASAMXMXAAXASASAXMXMXAMMMXMASXMSSSMMXSMMAXXAASXAAAASAXMAXAXAAAMXSSSMMMMMASMSSMXSAMMASASMMMAAMASMSXSASMMSAASAMSMMMSMMMM",
      "SSSSXMASMMXMAMMMSMAMAXXAXXXAMMMMSASASMSMSMMXSAMAMXMAMMMMAXAAMSAMSXSAMMMMXSAMXSMSMMMMSAMAMXMMASAMXMAMAXAMSXMMSASMMMSAMMSAMXMAAXMXMAXXAAAAMSXM",
      "SAAXSMXXMMASXMAMAMASMMMXMAMMSXXAAMMAMXAAAXSMSASMSSSSMAAMXMXMAMAXXMMMMSAXMSAMAXAAAXAAMMSAMAXSXSXSXSAMXSMMXAAMSAMMAAMASAXAMAMXMAXMSSSSSMSSXXAS",
      "MMMMMMSXMMASAMASASMSXAXMMSMSAMMSSXMAMSMSMXSAMXMAAAAMSMMSXMSXMSSMSMAAXMAXMMAMXMMMSSMXSASASAXSXMAMAMMMMXMASAMXMAMMSMMMMMMMSXSSMMXXAAMAAAAXMSMM",
      "SXAAAAXMSMMMXSASASASMXSXXAMXASAAMMSSXSXAXXMXMAMMMMMMAMSAMXAAMAMXXMMMMXMASXXMAMMSMMMMMMMMMMXMASXMSMMSAMMAAAXMSMMMAXAAAAXXAMXAAMAMXSMSMMMSAAAA",
      "ASXSMXSAXXAAXMXMAMAMMMMXMASMMMMXMAAMXMASMXMAMXSAXXXXAXXMAXMMMASMXXMASXSXSAMSSSMAAMSMSASXMASMXMASAAXAMSMSSSMAXMASMSSSSXSAMSSSMMAAAMMXXMASXSMM",
      "XSXMAAMXMSMSSMXMAMSMMAAXSAMXXSXSMMSSMMMMSMXAMXAMAMXSSSSSSMSASXMASXAAAAMAMXMAXAMSSMAAXAASXMXXMASXMSMMXMAAAAMSMSMXXMMAAAMXXXXAMSMSSSMSAMXMXMAM",
      "XSAMMMMAMAMMXMAMAXMASMXXAXXAMXAMXAAMMSAMASMSXSASMSAAXAAAAAAAMXMASXSAMXMAMXMMSSMMAXMSMMMXMASXMMXXMAMXSMMMSMMAAAAXSAMMMXMASMSMMAAXAAXXMXMMAMAM",
      "SMAMMAMASAXMAMSSSSSXMMMSMSMSSMMMMMMSAMASAMXAAMAMMMMMXMMSMMMAMAMMMAXMSASXMXAAAXASAMXAXAASXMXASASASMSASMAMAMXMMMSASMXXMAXAAAAAXMSMSMMXMAAMXSAM",
      "MSMMSAMXSASXSMAAMXMXMXXAXMMAAAXSAMXMXMAMMXMXMMMMSMSXXXXXMXMASASAMSMASMSAMSMMXSXMMXSMSXXMAXXXMASAMAMXSSXXASXSAAAMXAXAMMMSSMSSMAMAAMAAXXXAASAM",
      "XMMASMSMMAMAAXMXMASMMASMSSMSSMMSASAMSSSMAAXMMAMXMASMMXMASMSASAMXMAMXMAMXXMASASXAAXAXXMASMMMSMXMMMAMXMAXSAMASMSMXMMMMSMAMAXAAMAMMMSSMSMXMXMSS",
      "MSMASXAXMXMSMMXASMMAAAXXAAAAAAAXMSAMXAAMSXSAXASAMXMAMXMXMMMASASXSMSSMAMAASAMAXSXMXSMMSMAMAAAMXAMMAMMMAMMAMXMMXXXAXAXAMASXMSSMSSXMAMMAMSMSMAM",
      "AAMASXSSXSMMXAXMXMXAMSMMMXMMXMMSXSMMMSMMAMAXSMMASXSSMMSMMAMXMASAAXAXSAXXXAMMSMSMSMMMAAXASMSXSSMMSMSMMSSSMSMSXMMSSSMXMXASMAMAMAMMMASMAMSAAMAM",
      "SMSASAMSAAXAXSXSASMSAMASXMSSXAXMXMAMAXAMXSAMMXMAMXAAMAAAXMASMAMMSMSMSMXMXAXAMAXMAAMMSSSXSXMXAAXXAAAMSMAXAAAMMMAAMAMMMASXMASAMASAMXMMXSMSMSXS",
      "XXAXMASMXMMASMAMASMMASAMAMAASMMSAXMMASAMMMASXSASXMMMMSSSMXXXMXMSXAXAMMASXMMSMAXSMSMAAAMASAMMSMMSMSMMAMSMSMMMAMXMXAMMMXMASASXMMMMSMXSMMAMXXAA",
      "XAMXSSMMMXMXAMAMXMASXMASXMSXMSSSXSSMMMAMASXMASMXAMXXXXMMAMXMXSMMMSMSMSASAAAXMXMXAXMXSXMAMSMAXSMXAAMSSSMAMASMXSXMMASAMASAMXSASXAAXAMXAMAMAMAM",
      "XMXMXMAASXMSAXMSXMAMXMXMXAXXAXMXAAXAXSSMMMSMXMXSAMXMSAMXSMAMASAAAMXXAMASAMXMSSXMAMMAXAMXXXMSSMSMMMXMXAMAMXMMAMAASASASMSAMXMAAMMMXXMSSMASAMAA",
      "MMAMXSXMSAXSAMSAXMXSAXASMXMMAMMMSMSSMMXAXAXMASASMMAAMSMAMMXSASMMMSSMAMMMXSXSASXMASXMMXMSAMXXXAAXAMXMSXMMSSMMAMXMMASXMXXMMSMMMSSXSAMAXMASASXS",
      "ASASASAMMMMMMMMAMSASMSMSAAAAASAAAXAAAMXMMXMAAMASXSXXSAMXSSMMASXMXAAMMSMSAMXMASXXAMAMXSAMAMMMMSMSMSAMXXMASAASMSMXMMMMMSMMAXASXXAASXMXSMXSAMXX",
      "XSASASXMAAAAAXMMMMASXAMMXXSSMXMSXMXSMMASASMMSSMMXSAMSAMAMXASAMXSMXXMAAMMASMMMMAXXSASAMXSAMAAAAAAASASXXMMMMMAAXAMMAAXAAAMASAMSMMMMMMASAAMXSXS",
      "XMMMMMMSMSSSSMXMAMXMMSSMSXMAXMMXASMMAXXMASXAAAAMXMAMSXMAXMXMAXAXSMAMSSMXAMXMMMSMMAMMAMASXXXXSXSMMMASMMASASXSMSSSXSMMSSXMAMAMXXAAAAMMSMXMASAS",
      "MSMSAAXMXXAAXAMMAXSMSMAMSASAMMASXMASAMXMSMMMSSMMAMMMMXSMSSSSSMSAMXAMAMMMSMSSXMASAAMSXMXMMSSMMMMMXMMMASASMSAMXAAMAMXMAXAMXXXSMXSXSXSAMAMSAMAM",
      "AAASXSXSSMMMMSSXSSMMAMXMSAMMSMAXSAXSMSAXAXAMXXMMSXSASXMSAAAAXAXAASASASXMMAAMAMAMSAXXXMAAAAXAAXSAAMAXXMASMMMMMMSMAMAAAMXMAMXMXMMAXAMASAMMMMSM",
      "MMMMAXAXSXAAAXXAMAXAASMAMAMAAMMSMSMMXSAMMXSMMASAMXSASASMSMMMMSMSXSASMSAAMMMMMSAMXMASASXMMSSSMMMSSSXMSMXMASAXXMXMASMMSMAXASASAMXAMASAMMSMSAXS",
      "XXASAMXMMSSSSSMSMAASMSMASAMMXSXAAAXXAMXMSAXASXMAMAMMMMMMXSXXXMAAAXXXXSMMXMXXXMASXXAXMXXMAMAMAMAAMAMASAMXMMMASXSMAAAAXMAXASASAMMASXMMXSAMMASX",
      "MMXXASXSMAXMAAAAMXMXAXXAMASMMMMMSMXMXSSMXASAMXXAMAMXAAAMXMMMMMXMXMXMAXXMXSMMMSXMXMMSASXSSXMASMMMSAXXXXXXXMXMAAAAMMMSMSMXMMXMAMSMMMSAXSAXMMMX",
      "XMMSAMAMMMSSSMMMSMXMASMSSSMXAAAXAMXMAMAMMMMAMMSMSXSSMMMXAMMAAXAMAMMMXXXSAMAAAMAAXAAMAMAAXXXXXAXMMMXXMMSXMMAMMSMMMXMAAAMMMAAMAMAAAAMMAMAMSAMM",
      "AAAMMMAMMMAAAAXAAMXMMMAMXMASMSMMAMXMASAMAXMMXMAMAMXAAAMSMXASMSMSASXSMMMMMSSMMSSMXSAMMMMMMSMMSXMAAXSAAASASMXSAMXXMXMMSMSASXMSASMSMSSXAMSMSASX",
      "SMXSASMSMMMSMMMSSSXXAMXMAMAMMAXSMSMSAMXSMXXMASMSXSXMSMXASXAMXAASXSAMXAAAXMASAXAMAXAXSXMSAXAAMAMSMAASMMSAMXAMAXMASXMAMMSMSAMXASAAXMAMXSAASAMA",
      "XXAMAMAAXAAMXAAAAMMSXSMSXSAXXAXSAAAMMMMMAMSSMSASAXXMAXXAMXMSMMMMMMMMSXSMMSAMXSAMAMMMSAAMSSMMSAMAMXMMXAMAMMXMXAXSXMMASXMXMAAMAMMMMXMMMMMMMSMM",
      "SMSMSMSMSMSSMMXXSAMSASASAMXSMSSMSSSMSASMAMAAXMAMMMXMASMMMXMAMMAMAAAXMAMAMXSAMXXMASAASMMMAMMAMXSXMMXMSMSMMASXSMSMXAXASMMMASAXMASMXXAAAXMAAXMX",
      "XAXAMAXAAAAXXAXSMXSMAMSMAMAXXMAAAMAASXSSMSSMMMMMMXXSAMXAMAMAMSASMXSAMAMAMMMMXMSAMAMMMAAMXXAXSAXMXAAAXMAXSAXMMSAMSSMASAMAAXSXMASAASMMMSSMXSAM",
      "MSMAMSMSMSSSMMMXASXMXMXXXMASMSMMMSMMMMXAMAXXAXAAMMXMXMXASAXAMSASAAMMMXSXMSAXSAMXXMMSSSMSMSXMAXMSASMMSSMXMSSSXXMMAAMAMXMMSXMMSAMMMMSAMXXMSAMX",
      "SMSXMAMXXAAMASAMMSAMXAMXXMSAMXXMASMAAMMMMMSSMMSASXMMASMXSMMSAMXMMMMAMMMMAMXMAASAMXXAXMAXAAXSAMSXMAAAAAMSAMXMAMXMSSMASAMXMASAMASXMASMMXAXMASA",
      "XAAMSMSSMSMSAMXSASAMAAXMSMMMSMMMAXMSXSAXAXXASAXXXMASASMMMMAMASASXSMMMAAASXMMSMMXAAMMSMMMSMMMAMAMXSMMSSMMXSAMAMXMAAMXSMSAXAMAMAMAMASXMXMASXMM",
      "MXMAAXMAAAMMXSSMMSAMSMXMASAAAASMSSXMASMSMMSAMXSSMSXMAMMAMMXXMMMMAMASMSSXMASAMAXXMSSXAASXXASMMMASMMAAAAAAASASASXMXSMXXAMAMSSMMSSSMAXAXAMXMSSS",
      "ASMSSSMMSMXMAMXAXMMMAAMSASMMSSMAAAMSASXSAAAAXAXAXAMMSMSSSMSMXAXMAMAMAMXASXMASXMASAXXSSMASAMASXSMASMMSSMMMSXSXSXSAXAMMMSSXMAXAXAMMSSSMSXXMAMX",
      "SXAAXAXMMXMASASMMMSSMSMMASAAMAMMMSMXASASMMXXMXMASMSMMAMAXAAAMMSXSSMMXMXXMASAMAXMXXSAMAMXMXMMMXASAMAAXXAXXMXSAMAMAMSAAXAXMXMMXMSMMAAAAXAXMXSM",
      "XMMMSAMXMMSAMAXMASMSXAXMMMXMSAMMXAXXXMXMASMXMXSAXMAXMAMAMMMSAASMMAXMSSXMMAMMSMAMAAMMXAMXMAMAMSMMXSMSSSSMASAMAMMMXMASMMSXSASAMMAMMMSMSMMMSMAM",
      "MAAAAAAXXAAAMMMSMSAMSAMSAMXXSAMXSMMXSAXMAAXSAMMMSSSSSMMXSXAXMMMMSAMXAAXMMSXMAXAMAMSSSSSSSMXAMMSMAXAXAAMSMMASAMXMMAMAMXMASASAXSASXXAXXAAAXMAM",
      "SSMSSMMMMXMAMXAMMMMMMMASAXXAXMMXXAAASXSMSMSASXAXXAXXAXMASMSMXMAAMXMMMSSXAMASMSMSMMAAAAAAAASMSMAMMMMMMMMAXXAMXSAMSMMMSAMAMXSMMSXSXXMXSMMXSMSS",
      "MXMXMMASXSXAMAXMSMAXXSAMMSASAMSSSMMMSAMXMXAMXSMMMMMSAMMXXAXXXMASMMMAXAMMASAMAAAAMMMMMMMMMMXAAXXSAXMAXASXXSAMASMXAAAAXXSAMXXMASXMMMMMSXXAMAXA",
      "MAMXMSMSAMXSMMXMAAAXXMASAMXXAXAAMXMAMAMASMMXXAMXAAAMXASMMSMSMMAAASXAMASAMMXMXXMASXSAMXXXSMMSMMMSASMXMAXAASXMAMMXSSMSMASAXXAMASAXAAAAXAMSSSMA",
      "SMSAAAXXXMAMAMASMSXXAMXMMSSSMMMSMAMASAMASMXMSMMSSMSXSSMAXAAASMXSAMMMSAXMAMXMASMXXAXAXXSXAMMXMXXSAMAMMSMMXMSMSXSAAXAXMASMMSXMXSMMSMXXMXMAAASX",
      "AASMSMSXAMXSASAMXAASAMAMXAAAXAAAXASASAMASXAAAAMXMAAMSAMSSMSASMAMAXSAMXSMXSAMMXMMMMSMMMMSMSMAMSMMAMAXAXAXSAMXMAMMSMMMMASAAXAXAXXAMMSMXAMMSMAX",
      "MMMXAAXMAMXSAMXSMXMSASASXMSMMSSSSXSASAMXSXMSSSMAMMMMSAMMSXMASMXSXMSAMXMAASASAAAAAXAXAXAAXAMMSAASAMXMASAMXSMAMAMAAAASMASMMSXMMSMMSAAASXSAAXMS",
      "XSXSMSMXSMXMAMSAMMMSMSXSXXMAXAMMMASAMXMASMMAMXXSMXSAMXSMSXMAMMMAMXMXXMASMSAMMSSSMSAMXSSSSXSMSAMSSSXMAMXAMXSXSXMSSSMSAMXMXMASXXMSMMSMMMMXSSXM"
    )
}
