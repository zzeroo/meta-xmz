require image-base.bb

LICENSE = "GPLv2"

PR = "r0"

COMPATIBLE_MACHINE = "bananapro"


IMAGE_INSTALL += "\
  xmz-test-tool \
  xmz-test-tool-init \
"
