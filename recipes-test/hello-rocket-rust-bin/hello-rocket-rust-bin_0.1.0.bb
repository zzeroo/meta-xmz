inherit cargo

SUMMARY = "Hello World in Rust"
HOMEPAGE = "https://github.com/zzeroo/hello-world-rs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/zzeroo/hello-world-rs.git;protocol=https;branch=rocket"
SRCREV = "77763446596d9f5fb9f43165df3db805ad586545"
PR = "r0"
PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

# Fix: No GNU_HASH in the elf binary
INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"

