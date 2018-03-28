SUMMARY = "Packagegroup des OS Images der 'xMZ-Plattform' [Development Version]"
DESCRIPTION = "Diese Packagegroup enhält zusätzliche Packeted die bei der \
Entwicklung der 'xMZ-Plattform' hilfreich sind. \
Gleichzeitig wird die WLAN Funktionalität hergestellt. \
"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xMZ-Plattform"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

inherit packagegroup

COMPATIBLE_MACHINE = "^bananapro$"

RDEPENDS_${PN} = "\
    vim \
    git \
    git-perltools \
    tmux \
    zsh \
    curl \
    wireless-tools \
    wpa-supplicant \
    wlan-config \
    ethtool \
    linux-firmware \
    broadcom-firmware \
"
