require image-base.bb

LICENSE = "GPLv2"

PR = "r0"

COMPATIBLE_MACHINE = "bananapro"


IMAGE_INSTALL += "\
  co-no2-kombisensor-mod-kalibrator \
  co-no2-kombisensor-mod-kalibrator-init \
"
