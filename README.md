# yocto/OpenEmbedded Rezepte für die xMZ-Platform'

Rezepte für das yocto/OpenEmbedded Buildsystem.

Dazu gehören `xmz-server`, `xmz-gui` und Werkzeuge wie der `xmz-client`
und der `xmz-co-no2-calibrator`.

## Abhängikeiten

Dieser Layer hängt von folgenden Layern ab:

### Board Support Package (BSP) für Lemaker Geräte `meta-bsp_lemaker`

	URI: https://github.com/zzeroo/meta-bsp_lemaker
	branch: master
	revision: ba693ccefbbbce99cff07894aa6672c9695ad448

### meta-openembedded

Das OpenEmbedded Meta Repo `git://git.openembedded.org/meta-openembedded`
enthält viele verschiedene Layer. Es ist nur nötig dieses eine Meta Layer zu
clonen. In der bitbake `bblayers.conf` werden dann die verschieden Unterverzeichnisse
angegeben, z.B. `/home/build/meta-openembedded/meta-oe` oder
`/home/build/meta-openembedded/meta-gnome`

#### OpenEmbedded `meta-oe`

	URI: git://git.openembedded.org/meta-openembedded
	branch: master
	revision: a19aa29f7fa336cd075b72c496fe1102e6e5422b

#### OpenEmbedded `meta-python`

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-python
	branch: master
	revision: a19aa29f7fa336cd075b72c496fe1102e6e5422b


#### OpenEmbedded `meta-networking`

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-networking
	branch: master
	revision: a19aa29f7fa336cd075b72c496fe1102e6e5422b

### Webkit `meta-webkit`

Webkit wird von der `xmz-gui` benötigt.

	URI: https://github.com/Igalia/meta-webkit.git
	branch: master
	revision: 6413711dd065b0a0476930c8174d8d769963bc91

### Recipes der 'xMZ-Plattform' `meta-xmz`

	URI: https://github.com/zzeroo/meta-xmz
	branch: master
	revision: HEAD

### Rust Programiersprache `meta-rust-bin`

	URI: https://github.com/rust-embedded/meta-rust-bin
	branch: master
	revision: 4108da49c2de8dc79339900ad36e6182c1e93012
