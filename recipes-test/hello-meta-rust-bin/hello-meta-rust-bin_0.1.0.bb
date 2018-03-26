inherit cargo

SUMMARY = "Hello Rocket"
HOMEPAGE = "https://github.com/zzeroo/hello-world-rs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://git@github.com/zzeroo/hello-world-rs.git;protocol=ssh"

SRCREV = "05883fb68a2ca285783db0124412974681f25476"

PR = "r0"
PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

# Fix: No GNU_HASH in the elf binary
INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"

