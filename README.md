# yocto/OpenEmbedded Rezepte für die xMZ-Platform'

Rezepte für das yocto/OpenEmbedded Buildsystem.

Dazu gehören `xmz-server`, `xmz-gui` und Werkzeuge wie der `xmz-client`
und der `xmz-co-no2-calibrator`.

## Abhängikeiten

Dieser Layer hängt von folgenden Layern ab:

### Board Support Package (BSP) für Lemaker Geräte `meta-bsp_lemaker`

	URI: https://github.com/zzeroo/meta-bsp_lemaker
	layers: meta-bsp_lemaker
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
	layers: meta-oe
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

	URI: 
	layers: 
	branch: master
	revision: HEAD

### Recipes der 'xMZ-Plattform' `meta-xmz`

	URI: 
	layers: 
	branch: master
	revision: HEAD

### Rust Programiersprache `meta-rust-bin`

	URI: https://github.com/zzeroo/meta-rust-bin.git
	layers: meta-rust-bin
	branch: nightly
	revision: HEAD
