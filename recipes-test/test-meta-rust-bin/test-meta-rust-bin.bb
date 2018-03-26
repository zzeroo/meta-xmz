inherit cargo

SUMMARY = "GPIO Utilities"
HOMEPAGE = "git://github.com/rust-embedded/gpio-utils"
LICENSE = "MIT"

SRC_URI = "https://github.com/rust-embedded/gpio-utils.git;tag=${PV}"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=935a9b2a57ae70704d8125b9c0e39059"
